package BTVN1;

import java.util.Scanner;

public class Luachon2 {
	double d1, d2, d3;
	String name;
	int tuoi;
	Scanner in = new Scanner(System.in);
	public void Diem() {
		System.out.println("Tên:");
		name = in.nextLine();
		System.out.println("Tuổi:");
		tuoi = in.nextInt();
		System.out.println("Điểm chuyên cần:");
		d1 = in.nextDouble();
		System.out.println("Điểm giữa kì:");
		d2 = in.nextDouble();
		System.out.println("Điểm cuối kì:");
		d3 = in.nextDouble();
		System.out.println(d1*10/100 + d2*30/100 + d3*60/100);
	}
}
