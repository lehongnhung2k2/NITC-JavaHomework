package QuanLySach.singleton;

import java.util.ArrayList;
import java.util.List;

import QuanLySach.entity.Book;

public class Inventory {
	static private List<Book> inventory = new ArrayList<Book>();
	
	private Inventory() {
		
	}

	public static List<Book> getInventory() {
		return inventory;
	}

	public static boolean addToInventory(Book book) {
		inventory.add(book);
		return true;
	}
	
	public static Book getId(int id) {
		return inventory.get(id-1);
	}
	
	public static boolean isValid (int id) {
		for (Book i: inventory) {
			if(id == i.getId()) 
				return true;
		}
		return false;
	}
	public static boolean addQuantity(int id, int quantity) {
		if (Inventory.isValid(id)) {
			Book book = Inventory.getId(id);
			int oldQuantity= book.getQuantity();
			book.setQuantity(oldQuantity+ quantity);
			return true;
		}
		return false;
	}
	
	

}
