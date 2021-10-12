package QuanLySach.entity;

public class NgoaiVan extends Book{
	private String ISBN;

	
	public NgoaiVan(String nameTG, double price, int quantity, String iSBN) {
		super(nameTG, price, quantity);
		ISBN = iSBN;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public void show() {
		System.out.println("Id: "+this.getId()+ " | T�n TG: "+this.getNameTG()+ " | Gi�: "+ this.getPrice()+" | SL: "+this.getQuantity()+ " | M� ISBN: "+this.ISBN);
	}
	
	

}
