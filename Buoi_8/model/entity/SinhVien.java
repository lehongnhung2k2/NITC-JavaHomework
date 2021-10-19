package Buoi_8.model.entity;

import Buoi_8.model.enumPackage.Type;

public class SinhVien extends Info{
	private int type;
	private int id;
	private static int count=0;
	

	public SinhVien(String name, int age, int GT, int CV, int type) {
		super(name, age, GT, CV);
		this.type = type;
		id= ++count;
	}
		
	public int getId() {
			return id;
	}

	public String getType() {
		Type x = Type.nameOfValue(type);
		return x.label;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public void show() {
		System.out.println("ID: "+this.getId()+" | Tên: "+ this.getName()+" | Tuổi: "+this.getAge()+" | Giới tính: "+this.getGT()+" | Chức vụ: "+this.getCV()+" | Kiểu: "+this.getType());
		
	}
	
	

}
