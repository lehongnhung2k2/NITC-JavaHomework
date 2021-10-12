package LinhKien_Main;

import java.util.ArrayList;
import java.util.Scanner;

import LinhKien.CPU;
import LinhKien.ID;
import LinhKien.Mainboard;
import LinhKien.RAM;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<ID> l_ID = new ArrayList<ID>();
		l_ID.add(new ID(01));
		l_ID.add(new ID(02));
		l_ID.add(new ID(03));
		l_ID.add(new ID(04));

		
		ArrayList<RAM> l_RAM = new ArrayList<RAM>();
		l_RAM.add(new RAM("Static", l_ID.get(0), 4));
		l_RAM.add(new RAM("Dynamic", l_ID.get(1), 10));
		l_RAM.add(new RAM("SDR", l_ID.get(2), 6));
		l_RAM.add(new RAM("DDR", l_ID.get(3), 3));
		l_RAM.add(new RAM("Static", l_ID.get(2), 4));
		l_RAM.add(new RAM("Dynamic", l_ID.get(3), 10));
		l_RAM.add(new RAM("SDR", l_ID.get(0), 6));
		l_RAM.add(new RAM("DDR", l_ID.get(1), 3));
		
		
		ArrayList<CPU> l_CPU = new ArrayList<CPU>();
		l_CPU.add(new CPU("Intel Core i3", l_ID.get(0), 5));
		l_CPU.add(new CPU("Intel Core i5", l_ID.get(1), 4));
		l_CPU.add(new CPU("Intel Core i7", l_ID.get(2), 7));
		l_CPU.add(new CPU("Intel Core i9", l_ID.get(3), 2));
		l_CPU.add(new CPU("Intel Core i3", l_ID.get(3), 5));
		l_CPU.add(new CPU("Intel Core i5", l_ID.get(0), 4));
		l_CPU.add(new CPU("Intel Core i7", l_ID.get(1), 7));
		l_CPU.add(new CPU("Intel Core i9", l_ID.get(2), 2));
		
		ArrayList<Mainboard> l_Mainboard = new ArrayList<Mainboard>();
		l_Mainboard.add(new Mainboard("AT", l_ID.get(0), 3));
		l_Mainboard.add(new Mainboard("ATX", l_ID.get(1), 4));
		l_Mainboard.add(new Mainboard("LPX", l_ID.get(2), 5));
		l_Mainboard.add(new Mainboard("BTX", l_ID.get(3), 6));
		l_Mainboard.add(new Mainboard("AT", l_ID.get(3), 3));
		l_Mainboard.add(new Mainboard("ATX", l_ID.get(2), 4));
		l_Mainboard.add(new Mainboard("LPX", l_ID.get(0), 5));
		l_Mainboard.add(new Mainboard("BTX", l_ID.get(1), 6));
		
		
		System.out.println("Chọn 1 loại Ram: ");
		String nameRam;
		nameRam= input.nextLine();
		
		System.out.println("Bạn được chọn các laoin CPU sau: ");
		for (int i=0; i<8; i++)
		{
			if (nameRam.equals(l_RAM.get(i).getName())) 
			{
				int id= l_RAM.get(i).getId().getID();
				for (int j=0; j<8; j++) 
					if (id==l_CPU.get(j).getId().getID() && l_CPU.get(j).getSL()>0)
						System.out.println(l_CPU.get(j).getName());
			}
		}
		
		System.out.println("Bạn được chọn các loại Mainboard sau: ");
		for (int i=0; i<8; i++)
		{
			if (nameRam.equals(l_RAM.get(i).getName())) 
			{
				int id= l_RAM.get(i).getId().getID();
				
				for (int j=0; j<8; j++) 
					if (id==l_Mainboard.get(j).getId().getID()&& l_Mainboard.get(j).getSL()>0)
						System.out.println(l_Mainboard.get(j).getName());
			}
		}
				
		
	}

}
