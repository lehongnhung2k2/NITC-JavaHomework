package LinhKien;

public class Mainboard {
	private String name;
	private ID id;
	private int SL;
	
	public Mainboard(String name, ID id, int SL) {
		this.name = name;
		this.id = id;
		this.SL=SL;
	}

	public String getName() {
		return name;
	}

	public ID getId() {
		return id;
	}
	public int getSL () {
		return SL;
	}
	
	

}
