package BTVN2;

import java.util.ArrayList;
import java.util.Scanner;

public class DiemTrungBinh {
	ArrayList<LopHoc> list = new ArrayList<LopHoc>();
	int n;
	Scanner inp = new Scanner (System.in);
	public void khoitao() { 
		System.out.println("Nhập số học sinh: ");
		n = inp.nextInt();
		for(int i=0; i<n; i++)
		{
			String name, Class;
			int age;
			double a, b, c;
			inp.nextLine();
			System.out.println("Tên:");
			name= inp.nextLine();
			inp.nextLine();
			System.out.println("Tuổi:");
			age= inp.nextInt();
			inp.nextLine();
			System.out.println("Lớp:");
			Class= inp.nextLine();
			inp.nextLine();
			System.out.println("Điểm chuyên cần:");
			a= inp.nextDouble();
			System.out.println("Điểm giữa kì:");
			b= inp.nextDouble();
			System.out.println("Điểm cuối kì:");
			c= inp.nextDouble();
			list.add(new LopHoc(name, age, Class, a, b, c));
		}
	}
	public void DTB() { 
		for (int i=0; i<n; i++)
		{
			list.get(i).DanhSach();
		}
	}

}
