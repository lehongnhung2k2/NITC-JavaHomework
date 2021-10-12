package QuanLyHoaQua.singleton;

import java.util.HashMap;
import java.util.Map;

import QuanLyHoaQua.entity.Fruit;
import QuanLySach.entity.Book;
import QuanLySach.singleton.Inventory;

public class Cart {
	public static Map<Integer, Integer> cart = new HashMap<>();

	public static Map<Integer, Integer> getCart() {
		return cart;
	}

	
	public static boolean addToCart (int id, int quantity) {
		if (!QuanLyHoaQua.singleton.Inventory.isValid(id)) return false;
		
		Fruit fruit = QuanLyHoaQua.singleton.Inventory.getId(id);
		if (fruit.getQuantity() < quantity) return false;
		else {
			int oldQuantity= fruit.getQuantity();
			fruit.setQuantity(oldQuantity- quantity);
		}
		
		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity+quantity);
		}
		else cart.put(id,  quantity);
		
		return true;
		
	}

}
