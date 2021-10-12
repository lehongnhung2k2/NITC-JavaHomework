package QuanLySach.MainProgram;

import java.util.List;
import java.util.Scanner;

import QuanLySach.entity.Book;
import QuanLySach.entity.KhoaHoc;
import QuanLySach.entity.NgoaiVan;
import QuanLySach.entity.Van;
import QuanLySach.singleton.Cart;
import QuanLySach.singleton.Inventory;

public class Main {
	public static void main(String[] args) {
		Inventory.addToInventory(new Van("Văn Cao", 30, 4, 3));
		Inventory.addToInventory(new Van("Xuân Quỳnh", 20, 10, 2));
		Inventory.addToInventory(new KhoaHoc("ED", 16, 5, 1999));
		Inventory.addToInventory(new KhoaHoc("VH", 15, 4, 2003));
		Inventory.addToInventory(new NgoaiVan("TM", 30, 9, "T90"));
		Inventory.addToInventory(new NgoaiVan("ML", 20, 3, "H80"));
		
		List<Book> book = Inventory.getInventory();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Bạn muốn:");
		System.out.println("\t1. In ra kho sách");
		System.out.println("\t2. Bổ sung sách vào kho");
		System.out.println("\t3. Thêm sách vào giỏ");
		
		int luachon= input.nextInt();
		int id, quantity, n;
		
		if (luachon == 1) {
			for (Book i: book) {
				i.show();
				i.type();
			}
		}
		
		else if (luachon ==2) {
			System.out.println("Nhập vào số lần: ");
			n= input.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Mời bạn nhập id và số lượng sách muốn bổ sung vào kho");
				id= input.nextInt();
				quantity= input.nextInt();
				
				if (Inventory.addQuantity(id, quantity)) 
					System.out.println("Thêm vào kho thành công");
				else System.out.println("Không thành công");
			}
			
		}
		
		else {
			System.out.println("Nhập vào số lần: ");
			n= input.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Mời bạn nhập id và số lượng sách muốn thêm vào giỏ hàng");
				id= input.nextInt();
				quantity= input.nextInt();
			
				if (Cart.addToCart(id, quantity))
					System.out.println("Thêm vào giỏ hàng thành công");
				else System.out.println("Không thành công");
			}
		}
	}

}
