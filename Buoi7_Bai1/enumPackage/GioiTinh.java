package Buoi7_Bai1.enumPackage;


public enum GioiTinh {
	MALE ("Nam", 1),
	FEMALE ("Nữ", 2),
	OTHER ("Khác", 3);

	public final String label;
	public int val;

	private GioiTinh(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static GioiTinh nameOfValue (int val) {
		for (GioiTinh e : values()) {      
			if(e.val == val)
				return e;
		}
		return null;
	}
	
	
}
