package Buoi7_Bai1.enumPackage;

public enum Type {
	CQ ("Chính quy", 1),
	LT ("Liên thông", 2),
	TC ("Tại chức", 3);
	
	public final String label;
	public int val;

	private Type(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Type nameOfValue(int val) {
		for (Type i: values()) {
			if (i.val == val)
				return i;
		}
		return null;
	}

}
