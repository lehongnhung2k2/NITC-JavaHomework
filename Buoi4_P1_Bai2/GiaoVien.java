package QuanLyTruongHoc;

public class GiaoVien extends Chung{
	MonHoc mon;
	public GiaoVien(String name, int age, String CCCD, MonHoc mon) {
		this.name= name;
		this.age= age;
		this.CCCD= CCCD;
		this.mon= mon;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public String getCCCD() {
		return CCCD;
	}
	
	public MonHoc getmon() {
		return mon;
	}
}
