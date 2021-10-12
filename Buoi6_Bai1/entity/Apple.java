package QuanLyHoaQua.entity;

public class Apple extends Fruit{
	private double sugar;

	
	public Apple(String name, double price, int quantity, double sugar) {
		super(name, price, quantity);
		this.sugar = sugar;
	}


	public double getSugar() {
		return sugar;
	}


	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	
	public void show() {
		System.out.println("ID: "+ this.getId()+" | Tên: "+ this.getName()+" | Giá: "+ this.getPrice()+" | Số lượng: "+this.getQuantity()+" | Lượng đường"+this.sugar);
	}
	
	public void vitamin() {
		System.out.println("Vitamin: C");
		
	}
	
}
