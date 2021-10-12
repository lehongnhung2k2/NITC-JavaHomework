package QuanLyHoaQua;

public class Banana extends Infor{
	private String KLKali;
	
	public Banana(String name, int gia, int SL, String KLKali) {
		super(name, gia, SL);
		this.KLKali= KLKali;
	}
	
	public String getKLKali() {
		return KLKali;
	}
	
	@Override
	public String toString() {
		return getName()+ ","+ getGia()+","+ getSL()+","+ getKLKali();
	}
}
