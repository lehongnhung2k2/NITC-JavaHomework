package ChuVi_DienTich;

import java.util.Arrays;
import java.util.Scanner;

public class HinhChuNhat extends Getnumberofsides{
	Scanner input = new Scanner(System.in);
	public void tinh() {
		// 4 cạnh
		System.out.println("Số lượng cạnh: ");
		canh = input.nextInt();
		int a[] = new int[canh];
	
		System.out.println("Nhập các cạnh: ");
		for (int i=0; i<canh; i++) {
			a[i]= input.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Chu vi: " + (a[0]+a[2])*2);
		System.out.println("Diện tích: " +a[0]*a[2]);
	}
	
}
