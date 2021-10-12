package LinhKien;

public class RAM {
	private String name;
	private ID id;
	private int SL;
	
	public RAM(String name, ID id, int SL) {
		this.name = name;
		this.id=id;
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
