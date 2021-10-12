package QuanLySach.entity;

public class KhoaHoc extends Book{
	private int year;

	
	public KhoaHoc(String nameTG, double price, int quantity, int year) {
		super(nameTG, price, quantity);
		this.year = year;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public void show() {
		System.out.println("Id: "+this.getId()+ " | Tên TG: "+this.getNameTG()+ " | Giá: "+ this.getPrice()+" | SL: "+this.getQuantity()+ " | Năm xuất bản: "+ this.year);
	}

}
