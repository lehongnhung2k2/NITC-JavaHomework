package QuanLyHoaQua.singleton;

import java.util.ArrayList;
import java.util.List;

import QuanLyHoaQua.entity.Fruit;

public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();
	
private Inventory() {
		
	}

	public static List<Fruit> getInventory() {
		return inventory;
	}

	public static boolean addToInventory (Fruit fruit) {
		inventory.add(fruit);
		return true;
	}
	
	public static boolean isValid (int id) {
		for (Fruit i: inventory) {
			if (id == i.getId()) return true;
		}
		return false;
	}
	
	public static Fruit getId (int id){
		return inventory.get(id-1);
	}
	
	public static boolean addQuantity(int id, int quantity) {
		if (Inventory.isValid(id)) {
			Fruit fruit = Inventory.getId(id);
			int oldQuantity= fruit.getQuantity();
			fruit.setQuantity(quantity+oldQuantity);
			return true;
		}
		return false;
	}
	
	
}
