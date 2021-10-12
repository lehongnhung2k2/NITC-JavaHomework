package QuanLyHoaQua;

import java.util.ArrayList;

public class QuanLy{
	public void QL(){
		ArrayList<Apple> list_Apple= new ArrayList<Apple>();
		list_Apple.add(new Apple("Táo đỏ", 10000, 3, "30 calo"));
		list_Apple.add(new Apple("Táo xanh", 15000, 5, "28 calo"));
		
		ArrayList<Oranges> list_Orange= new ArrayList<Oranges>();
		list_Orange.add(new Oranges("Canh sành", 10000, 7, "300g"));
		list_Orange.add(new Oranges("Canh canh", 18000, 10, "400g"));
		
		ArrayList<Banana> list_Banana= new ArrayList<Banana>();
		list_Banana.add(new Banana("Chuối tây", 30000, 4, "600g"));
		list_Banana.add(new Banana("Chuối hột", 25000, 8, "700g"));
		
		
	}
	
}
