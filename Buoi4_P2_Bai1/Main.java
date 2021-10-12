package QuanLyHoaQua;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Apple> list_Apple= new ArrayList<Apple>();
		list_Apple.add(new Apple("Táo đỏ", 10000, 3, "30 calo"));
		list_Apple.add(new Apple("Táo xanh", 15000, 5, "28 calo"));
		
		ArrayList<Oranges> list_Orange= new ArrayList<Oranges>();
		list_Orange.add(new Oranges("Canh sành", 10000, 7, "300g"));
		list_Orange.add(new Oranges("Canh canh", 18000, 10, "400g"));
		
		ArrayList<Banana> list_Banana= new ArrayList<Banana>();
		list_Banana.add(new Banana("Chuối tây", 30000, 4, "600g"));
		list_Banana.add(new Banana("Chuối hột", 25000, 8, "700g"));
		
		
		System.out.println("Bạn muốn?");
		System.out.println("1. Xem thông tin về hoa quả \n2. Mua hàng");
		int luachon;
		luachon= input.nextInt();
		
		if (luachon==1) {
			for (int i=0; i<2; i++) {
				System.out.println(list_Apple.get(i).toString());
			}
			
			for (int i=0; i<2; i++) {
				System.out.println(list_Orange.get(i).toString());
			}

			for (int i=0; i<2; i++) {
				System.out.println(list_Banana.get(i).toString());
			}
		}
		
		else {
			System.out.println("Số tiền: ");
			int tien;
			tien= input.nextInt();
			System.out.println("Bạn có thể mua nhiều nhất mỗi loại là:");
			
			for (int i=0; i<2; i++) {
				int Soqua= tien/list_Apple.get(i).getGia();
				if (Soqua<=list_Apple.get(i).getSL()) System.out.println(list_Apple.get(i).getName()+": "+Soqua);
				else System.out.println(list_Apple.get(i).getName()+": "+list_Apple.get(i).getSL());
			}
			
			for (int i=0; i<2; i++) {
				int Soqua= tien/list_Orange.get(i).getGia();
				if (Soqua<=list_Orange.get(i).getSL()) System.out.println(list_Orange.get(i).getName()+": "+Soqua);
				else System.out.println(list_Orange.get(i).getName()+": "+list_Orange.get(i).getSL());
			}
			
			for (int i=0; i<2; i++) {
				int Soqua= tien/list_Banana.get(i).getGia();
				if (Soqua<=list_Banana.get(i).getSL()) System.out.println(list_Banana.get(i).getName()+": "+Soqua);
				else System.out.println(list_Banana.get(i).getName()+": "+list_Banana.get(i).getSL());
			}
		}
			
	}

}
