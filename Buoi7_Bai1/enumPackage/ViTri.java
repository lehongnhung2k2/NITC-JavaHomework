package Buoi7_Bai1.enumPackage;

public enum ViTri {
	CBV ("Cổng bảo vệ", 0),
	T1 ("Tầng 1", 1),
	T2 ("Tầng 2", 2),
	T3 ("Tầng 3", 3),
	NVS1 ("Nhà vệ sinh tầng 1", 11),
	NVS2 ("Nhà vệ sinh tầng 2", 12),
	NVS3 ("Nhà vệ sinh tầng 3", 13);
	
	public final String label;
	public int val;

	private ViTri(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static ViTri nameOfValue(int val) {
		for (ViTri i: values()) {
			if (i.val == val)
				return i;
		}
		return null;
	}
	
}
