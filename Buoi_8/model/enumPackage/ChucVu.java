package Buoi_8.model.enumPackage;

public enum ChucVu {
	BV ("Bảo vệ", 1),
	VS ("Vệ sinh", 2),
	GV ("Giảng viên", 3),
	SV ("Sinh viên", 4);
	
	public final String label;
	public int val;

	private ChucVu(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static ChucVu nameOfValue (int val) {
		for (ChucVu i : values()) {
			if (i.val == val)
				return i;
		}
		return null;
	}

}
