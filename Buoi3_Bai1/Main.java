package MayTinh_Main;

import java.util.ArrayList;

import MayTinh.CPU;
import MayTinh.Hang;
import MayTinh.Laptop;
import MayTinh.Mainboard;
import MayTinh.RAM;

public class Main {
	public static void main(String[] args) {
		ArrayList<Hang> list_Hang = new ArrayList<Hang>();
		list_Hang.add(new Hang("Dell"));
		list_Hang.add(new Hang("Asus"));
		list_Hang.add(new Hang("HP"));
		list_Hang.add(new Hang("Lenovo"));
		
		
		ArrayList<CPU> list_CPU = new ArrayList<CPU>();
		list_CPU.add(new CPU("Intel Core i3", list_Hang.get(0)));
		list_CPU.add(new CPU("Intel Core i5", list_Hang.get(1)));
		list_CPU.add(new CPU("Intel Core i7", list_Hang.get(2)));
		list_CPU.add(new CPU("Intel Core i9", list_Hang.get(3)));
		
		ArrayList<RAM> list_RAM = new ArrayList<RAM>();
		list_RAM.add(new RAM("Static RAM", list_Hang.get(0)));
		list_RAM.add(new RAM("Dynamic RAM", list_Hang.get(1)));
		list_RAM.add(new RAM("SDR SDRAM", list_Hang.get(2)));
		list_RAM.add(new RAM("DDR SDRAM", list_Hang.get(3)));
		
		ArrayList<Mainboard> list_Mainboard = new ArrayList<Mainboard>();
		list_Mainboard.add(new Mainboard("Mainboard AT", list_Hang.get(0)));
		list_Mainboard.add(new Mainboard("Mainboard ATX", list_Hang.get(1)));
		list_Mainboard.add(new Mainboard("Mainboard LPX", list_Hang.get(2)));
		list_Mainboard.add(new Mainboard("Mainboard BTX", list_Hang.get(3)));
		
		ArrayList<Laptop> list_Laptop = new ArrayList<Laptop>();
		list_Laptop.add(new Laptop(list_Hang.get(0), list_CPU.get(1), list_RAM.get(2), list_Mainboard.get(3), 3));
		list_Laptop.add(new Laptop(list_Hang.get(3), list_CPU.get(2), list_RAM.get(1), list_Mainboard.get(0), 4));
		list_Laptop.add(new Laptop(list_Hang.get(1), list_CPU.get(0), list_RAM.get(3), list_Mainboard.get(2), 5));
		list_Laptop.add(new Laptop(list_Hang.get(2), list_CPU.get(3), list_RAM.get(0), list_Mainboard.get(1), 6));
		
		
		
		for (int i=0; i<=3; i++)
		{
			System.out.printf("%s %s %s %s %d \n", list_Laptop.get(i).getHang().getName(),list_Laptop.get(i).getCpu().getName(), list_Laptop.get(i).getRam().getName(),
                list_Laptop.get(i).getMainboard().getName(), list_Laptop.get(i).getSL());
			
		}
	}

}
