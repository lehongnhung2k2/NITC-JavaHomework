package QuanLyHoaQua.mainProgram;

import java.util.List;
import java.util.Scanner;

import QuanLyHoaQua.entity.Apple;
import QuanLyHoaQua.entity.Banana;
import QuanLyHoaQua.entity.Fruit;
import QuanLyHoaQua.entity.Orange;
import QuanLyHoaQua.singleton.Inventory;
import QuanLySach.entity.Book;
import QuanLySach.singleton.Cart;

public class Main {
	public static void main(String[] args) {
		Inventory.addToInventory(new Apple("Táo đỏ", 20, 3, 4.9));
		Inventory.addToInventory(new Apple("Táo xanh", 15, 5, 3.2));
		Inventory.addToInventory(new Banana("Chuối tiêu", 16, 10, 4));
		Inventory.addToInventory(new Banana("Chuối hột", 13, 4, 5));
		Inventory.addToInventory(new Orange("Cam sành", 25, 7, 0.1));
		
		List<Fruit> fruit = Inventory.getInventory();
		
		System.out.println("Bạn muốn:");
		System.out.println("\t1. In ra danh sách hoa quả");
		System.out.println("\t2. Bổ sung hoa quả vào kho");
		System.out.println("\t3. Thêm hoa quả vào giỏ hàng");
		
		Scanner input= new Scanner(System.in);
		int luachon= input.nextInt();
		int id, quantity, n;
		
		if (luachon == 1) {
			for (Fruit i: fruit) {
				i.show();
				i.vitamin();
			}
		}
		
		else if (luachon ==2) {
			System.out.println("Nhập vào số lần: ");
			n= input.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Mời bạn nhập id và số lượng quả muốn bổ sung vào kho");
				id= input.nextInt();
				quantity= input.nextInt();
				
				if (Inventory.addQuantity(id, quantity)) 
					System.out.println("Bổ sung thành công");
				else System.out.println("Không thành công");
			}
			
		}
		
		else {
			System.out.println("Nhập vào số lần: ");
			n= input.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Mời bạn nhập id và số lượng quả muốn thêm vào giỏ hàng");
				id= input.nextInt();
				quantity= input.nextInt();
			
				if (QuanLyHoaQua.singleton.Cart.addToCart(id, quantity))
					System.out.println("Thêm vào giỏ hàng thành công");
				else System.out.println("Không thành công");
			}
		}
	}

}
