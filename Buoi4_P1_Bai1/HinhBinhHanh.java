package ChuVi_DienTich;

import java.util.Scanner;

public class HinhBinhHanh extends Getnumberofsides{
	Scanner input = new Scanner(System.in);
	public void tinh() {
		//3 cạnh
		System.out.println("Số lượng cạnh: ");
		canh = input.nextInt();
		int a[] = new int[canh];
		
		System.out.println("Nhập 2 cạnh và đường cao: ");
		for (int i=0; i<canh; i++) {
			a[i]= input.nextInt();
		}
		
		System.out.println("Chu vi: " + (a[0]+a[1])*2);
		System.out.println("Diện tích: " +a[1]*a[2]);
	}

}
