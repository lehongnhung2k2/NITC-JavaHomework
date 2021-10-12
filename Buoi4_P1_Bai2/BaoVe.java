package QuanLyTruongHoc;

public class BaoVe extends Chung{
	public BaoVe(String name, int age, String CCCD) {
		this.name= name;
		this.age= age;
		this.CCCD= CCCD;
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

}
