package QuanLySach.entity;

public class Van extends Book{
	private int edition;

	
	public Van(String nameTG, double price, int quantity, int edition) {
		super(nameTG, price, quantity);
		this.edition = edition;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public void show() {
		System.out.println("Id: "+this.getId()+ " | Tên TG: "+this.getNameTG()+ " | Giá: "+ this.getPrice()+" | SL: "+this.getQuantity()+ " | Tái bản lần thứ: "+this.edition+" | ");
	}
	
	@Override
	public void type() {
		System.out.println("Thể loại: Văn học");
		
	}
	

}
