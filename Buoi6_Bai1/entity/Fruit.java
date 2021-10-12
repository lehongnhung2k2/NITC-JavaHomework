package QuanLyHoaQua.entity;

public abstract class Fruit {
	private String name;
	private double price;
	private int quantity;
	private int id;
	private static int count=0;

	public Fruit(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getId () {
		return id;
	}
	
	public abstract void show();
	
	public abstract void vitamin();
}
