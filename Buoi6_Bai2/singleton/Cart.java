package QuanLySach.singleton;

import java.util.HashMap;
import java.util.Map;

import QuanLySach.entity.Book;

public class Cart {
	static private Map<Integer, Integer> cart= new HashMap<Integer, Integer>();
	
	private Cart() {
		
	}

	public static Map<Integer, Integer> getCart() {
		return cart;
	}

	public static boolean addToCart (int id, int quantity) {
		if (!Inventory.isValid(id)) return false;
		
		Book book= Inventory.getId(id);
		if (book.getQuantity() < quantity) return false;
		else {
			int oldQuantity= book.getQuantity();
			book.setQuantity(oldQuantity- quantity);
		}
		
		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity+quantity);
		}
		else cart.put(id,  quantity);
		
		return true;
	}

}
