package Buoi7_Bai1.entity;

public class NhanVien extends Info{
	private int id;
	private static int count=0;

	public NhanVien(String name, int age, int GT, int CV) {
		super(name, age, GT, CV);
		id= ++count;
	}
	
	
	public int getId() {
		return id;
	}


	@Override
	public void show() {
		System.out.println("ID: "+this.getId()+" | Tên: "+ this.getName()+" | Tuổi: "+this.getAge()+" | Giới tính: "+this.getGT()+" | Chức vụ: "+this.getCV());
		
	}

	
	

}
