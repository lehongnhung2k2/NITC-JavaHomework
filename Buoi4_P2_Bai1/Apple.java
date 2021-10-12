package QuanLyHoaQua;

public class Apple extends Infor{
	private String duong;
	
	public Apple(String name, int gia, int Sl, String duong) {
		super(name, gia, Sl);
		this.duong=duong;
	}
	
	public String getDuong () {
		return duong;
	}
	@Override
	public String toString() {
		return getName()+ ","+ getGia()+","+ getSL()+","+ getDuong();
	}

}
