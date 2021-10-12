package QuanLySach.entity;

public abstract class Book {
	private String nameTG;
	private double price;
	private int quantity;
	private int id;
	static private int count=0;
	
	public Book(String nameTG, double price, int quantity) {
		super();
		this.nameTG = nameTG;
		this.price = price;
		this.quantity = quantity;
		this.id = ++count;
	}

	public String getNameTG() {
		return nameTG;
	}

	public void setNameTG(String nameTG) {
		this.nameTG = nameTG;
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

	public int getId() {
		return id;
	}
	
	public void show() {
		
	}
	
	public abstract void type();

}
