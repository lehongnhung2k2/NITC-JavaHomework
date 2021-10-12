package QuanLyHoaQua;

public class Infor {
	private String name;
	private int gia;
	private int SL;
	//private int SLConLai;
	
	public Infor(String name, int gia, int SL) {
		this.name=name;
		this.gia=gia;
		this.SL=SL;
		//this.SLConLai= SLConLai;
	}
	public void setName (String name) {
		this.name= name;
	}
	public void setPrice (int gia) {
		this.gia= gia;
	}
	public void setNumber (int SL) {
		this.SL= SL;
	}
	
	public String getName () {
		return name;
	}
	public int getGia() {
		return gia;
	}
	public int getSL() {
		return SL;
	}
	public int inSL(int SL) {
		return SL;
	}
//	public void inSL() {
//		System.out.println("Số lượng hoa quả:");
//	}

}
