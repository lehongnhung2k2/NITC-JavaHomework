package BTVN2;

public class LopHoc {
	private String name, Class;
	private int age;
	private double d1, d2, d3;
	
	public void setname (String name) {
		this.name= name;
	}
	public String getname () {
		return this.name;
	}
	
	public void setage (int age) {
		this.age= age;
	}
	public int getage () {
		return this.age;
	}
	public void setclass (String Class) {
		this.Class= Class;
	}
	public String getclass () {
		return this.Class;
	}
	
	public LopHoc (String name, int age, String Class, double a, double b, double c) {
		this.name= name;
		this.age= age;
		this.Class= Class;
		d1= a;
		d2= b;
		d3= c;
	}
	
	
	public double Dtb() {
		return (d1*0.1+d2*0.3+d3*0.6);
	}
	
	public void DanhSach() { 
		System.out.println("Tên: "+this.name);
		System.out.println("Tuổi: "+this.age);
		System.out.println("Lớp: "+this.Class);
		System.out.println("Điểm TB: "+Dtb());
	}
}
