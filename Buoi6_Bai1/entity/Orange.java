package QuanLyHoaQua.entity;

public class Orange extends Fruit{
	private double weight;

	
	public Orange(String name, double price, int quantity, double weight) {
		super(name, price, quantity);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public void show() {
		System.out.println("ID: "+ this.getId()+" | Tên: "+ this.getName()+" | Giá: "+ this.getPrice()+" | Số lượng: "+this.getQuantity()+" | Cân nặng: "+this.weight);
	}

	@Override
	public void vitamin() {
		System.out.println("Vitamin: C");
	}
}
