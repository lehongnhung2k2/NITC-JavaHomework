package BTVN2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int lc, c;
		System.out.println("Bạn muốn tính? \n 1. Chu vi, diện tích \n 2. Điểm trung bình");
		lc = input.nextInt();
		if (lc==1) {
			System.out.println("Bạn chọn?");
			System.out.println("1. Hình tam giác");
			System.out.println("2. Hình vuông");
			System.out.println("3. Hình chữ nhật");
			System.out.println("4. Hình thoi");
			c = input.nextInt();
			if (c==1) {
				Triangle s= new Triangle();
				s.khoitao();
				s.chuvi();
				s.dientich();
			}
			else if (c==2) {
				Square s= new Square();
				s.khoitao();
				s.chuvi();
				s.dientich();
			}
			else if (c==3) {
				Rectangular s= new Rectangular();
				s.khoitao();
				s.chuvi();
				s.dientich();
			}
			else {
				Rhombus s= new Rhombus();
				s.khoitao();
				s.chuvi();
				s.dientich();
			}
		}
		else {
			
			DiemTrungBinh s = new DiemTrungBinh();
			s.khoitao();
			s.DTB();
		}
	}

}
