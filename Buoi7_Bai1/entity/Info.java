package Buoi7_Bai1.entity;

import Buoi7_Bai1.enumPackage.ChucVu;
import Buoi7_Bai1.enumPackage.GioiTinh;

public abstract class Info {
	private String name;
	private int age;
	private int GT;
	private int CV;
	
	
	public Info(String name, int age, int GT, int CV) {
		super();
		this.name = name;
		this.age = age;
		this.GT = GT;
		this.CV = CV;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGT() {
		GioiTinh x = GioiTinh.nameOfValue(GT);
		return x.label;
	}
	
	public void setGT(int gT) {
		GT = gT;
	}
	
	public String getCV() {
		ChucVu x = ChucVu.nameOfValue(CV);
		return x.label;
	}
	
	public void setCV(int cV) {
		CV = cV;
	}

	
	public void show() {
		
	}
	
	
	
}
