package BTVN2;

import java.util.ArrayList;
import java.util.Scanner;

public class Rhombus {
	ArrayList<New> list = new ArrayList<New>();
	Scanner inp= new Scanner(System.in);
	public void khoitao() {
		int a, b, c, d;
		System.out.println("Nhập đường chéo thứ nhất: ");
		System.out.println("x1=");
		a = inp.nextInt();
		System.out.println("y1=");
		b = inp.nextInt();
		System.out.println("x2=");
		c = inp.nextInt();
		System.out.println("y2=");
		d = inp.nextInt();
		list.add(new New(a, b, c, d));
		System.out.println("Nhập đường chéo thứ hai");
		System.out.println("x1=");
		a = inp.nextInt();
		System.out.println("y1=");
		b = inp.nextInt();
		System.out.println("x2=");
		c = inp.nextInt();
		System.out.println("y2=");
		d = inp.nextInt();
		list.add(new New(a, b, c, d));
		
	}
	
	public void chuvi () { 
		double a, b, x;
		a= list.get(0).length();
		b= list.get(1).length();
		x= Math.sqrt((a/2)*(a/2)+(b/2)*(b/2));
		System.out.println("Chu vi: ");
		System.out.println(x*4);
	}

	public void dientich() {
		double a, b;
		a= list.get(0).length();
		b= list.get(1).length();
		System.out.println("Dện tích: ");
		System.out.println(a*b/2);
	}

}
