package BTVN2;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
	ArrayList<New> list = new ArrayList<New>();
	Scanner inp= new Scanner(System.in);
	public void khoitao() {
		int a, b, c, d;
		System.out.println("Nhập cạnh thứ nhất");
		System.out.println("x1=");
		a = inp.nextInt();
		System.out.println("y1=");
		b = inp.nextInt();
		System.out.println("x2=");
		c = inp.nextInt();
		System.out.println("y2=");
		d = inp.nextInt();
		list.add(new New(a, b, c, d));
		System.out.println("Nhập cạnh thứ hai");
		System.out.println("x1=");
		a = inp.nextInt();
		System.out.println("y1=");
		b = inp.nextInt();
		System.out.println("x2=");
		c = inp.nextInt();
		System.out.println("y2=");
		d = inp.nextInt();
		list.add(new New(a, b, c, d));
		System.out.println("Nhập cạnh thứ ba");
		System.out.println("x1=");
		a = inp.nextInt();
		System.out.println("y1=");
		b = inp.nextInt();
		System.out.println("x2=");
		c = inp.nextInt();
		System.out.println("y2=");
		d = inp.nextInt();
		
	}
	
	public void chuvi () { 
		double a, b, c;
		a= list.get(0).length();
		b= list.get(1).length();
		c= list.get(2).length();
		System.out.println("Chu vi: ");
		System.out.println(a+b+c);
	}

	public void dientich() {
		double a, b, c;
		a = list.get(0).length();
		b=  list.get(1).length();
		c=  list.get(2).length();
		System.out.println("Dện tích: ");
		System.out.println(a*b*c);
	}
}
