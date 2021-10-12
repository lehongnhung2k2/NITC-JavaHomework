package ThuVien;

public class Sach {
	private String ma;
	private String name;
	private Tacgia TG;
	private Trangthai trangthai;
	public Sach(String ma, String name, Tacgia tG, Trangthai trangthai) {
		
		this.ma = ma;
		this.name = name;
		TG = tG;
		this.trangthai = trangthai;
	}
	public String getMa() {
		return ma;
	}
	public String getName() {
		return name;
	}
	public Tacgia getTG() {
		return TG;
	}

	public Trangthai getTrangthai() {
		return trangthai;
	}
	
	

}
