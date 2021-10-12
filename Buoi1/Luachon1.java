package BTVN1;

import java.util.Scanner;

public class Luachon1 {
	double c1, c2, c3;
	int a, h;
	Scanner in = new Scanner(System.in);
	public void CVDT() {
		System.out.println("Chọn \n 1. Chu vi \n 2. Diện tích");
		a = in.nextInt();
		if (a==1) 
		{
			System.out.println("Chu vi của \n 1. Hình vuông \n 2. Hình chữ nhật \n 3. Hình tam giác \n 4. Hình thoi");
			int h= in.nextInt();
			if (h==1) 
			{
				System.out.println("Nhập vào cạnh hình vuông");
				c1 = in.nextDouble();
				System.out.println(4*c1);
			}
			else if (h==2)
			{
				System.out.println("Nhập 2 cạnh hình chữ nhật");
				c1 = in.nextDouble();
				c2 = in.nextDouble();
				System.out.println((c1+c2)*2);
			}
			else if (h==3)
			{
				System.out.println("Nhập 3 cạnh hình tam giác");
				c1 = in.nextDouble();
				c2 = in.nextDouble();
				c3 = in.nextDouble();
				System.out.println(c1+c2+c3);
			}
			else 
			{
				System.out.println("Nhập vào cạnh hình thoi");
				c1 = in.nextDouble();
				System.out.println(4*c1);
			}
		}
		else 
		{
			System.out.println("Diện tích của \n 1. Hình vuông \n 2. Hình chữ nhật \n 3. Hình tam giác \n 4. Hình thoi");
			int h= in.nextInt();
			if (h==1) 
			{
				System.out.println("Nhập vào cạnh hình vuông");
				c1 = in.nextDouble();
				System.out.println(c1*c1);
			}
			else if (h==2)
			{
				System.out.println("Nhập 2 cạnh hình chữ nhật");
				c1 = in.nextDouble();
				c2 = in.nextDouble();
				System.out.println(c1*c2);
			}
			else if (h==3)
			{
				System.out.println("Nhập 3 cạnh hình tam giác");
				c1 = in.nextDouble();
				c2 = in.nextDouble();
				c3 = in.nextDouble();
				double x=(c1+c2+c3)/2;
				System.out.println(Math.sqrt(x*(x-c1)*(x-c2)*(x-c3)));
			}
			else 
			{
				System.out.println("Nhập 2 đường chéo của hình thoi");
				c1 = in.nextDouble();
				c2 = in.nextDouble();
				System.out.println(4*c1);
			}
		}
	}
}
	


