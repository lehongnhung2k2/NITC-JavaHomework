package ChuVi_DienTich;

import java.util.Arrays;
import java.util.Scanner;

public class TamGiac extends Getnumberofsides{
	Scanner input = new Scanner(System.in);
	public void tinh() {
		//3 cạnh
		System.out.println("Số lượng cạnh: ");
		canh = input.nextInt();
		double a[] = new double[canh];
		double ncv=0, DT;
		
		System.out.println("Nhập các cạnh: ");
		for (int i=0; i<canh; i++) {
			a[i]= input.nextDouble();
			ncv+=a[i];
		}
		
		ncv= ncv/2;
		DT= Math.sqrt(ncv* (ncv-a[0])* (ncv-a[1]) * (ncv-a[2]));
			
		System.out.println("Chu vi: " + (a[0]+a[1]+a[2]));
		System.out.println("Diện tích: " + DT);
	}

}
