package ChuVi_DienTich;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Bạn muốn tính Chu vi, Diện tích của:");
		System.out.println(" 1. Hình chữ nhật \n 2. Hình vuông \n 3. Hình tam giác \n 4. Hình bình hành");
		Scanner input = new Scanner(System.in);
		int luachon;
		luachon= input.nextInt();
		if (luachon==1)
		{
			HinhChuNhat H = new HinhChuNhat();
			H.tinh();
		}
		else if (luachon==2)
		{
			HinhVuong H = new HinhVuong();
			H.tinh();
		}
		else if (luachon==3)
		{
			TamGiac H = new TamGiac();
			H.tinh();
		}
		else
		{
			HinhBinhHanh H = new HinhBinhHanh();
			H.tinh();
		}
		
	}

}
