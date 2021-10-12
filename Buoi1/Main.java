package BTVN1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Lựa chọn tính \n 1. Chu vi và diện tích \n 2. Điểm trung bình");
		int luachon = in.nextInt();
		if (luachon==1) 
		{
			Luachon1 LC1 = new Luachon1();
			LC1.CVDT();
		}
		else 
		{
			Luachon2 LC2 = new Luachon2();
			LC2.Diem();
		}
	}

}
