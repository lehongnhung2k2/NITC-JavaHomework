package QuanLyHoaQua.entity;

public class Banana extends Fruit{
	private double kali;

	
	public Banana(String name, double price, int quantity, double kali) {
		super(name, price, quantity);
		this.kali = kali;
	}

	public double getKali() {
		return kali;
	}

	public void setKali(double kali) {
		this.kali = kali;
	}
	
	@Override
	public void show() {
		System.out.println("ID: "+ this.getId()+" | Tên: "+ this.getName()+" | Giá: "+ this.getPrice()+" | Số lượng: "+this.getQuantity()+" | KL kali: "+this.kali);
	}

	@Override
	public void vitamin() {
		System.out.println("Vitamin: B6, C");
	}
}
