package QuanLyHoaQua;

public class Oranges extends Infor{
	private String cannang;
	
	public Oranges(String name, int gia, int SL, String cannang) {
		super(name, gia, SL);
		this.cannang= cannang;
	}

	public String getCannang() {
		return cannang;
	}

	@Override
	public String toString() {
		return getName()+ ","+ getGia()+","+ getSL()+","+ getCannang();
	}
}
