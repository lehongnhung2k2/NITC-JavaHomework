package Buoi_8.model.enumPackage;

public enum PhongHoc {
	A101("A101", 1), 
	A102("A102", 2), 
	A103("A103", 3), 
	A201("A201", 4), 
	A202("A202", 5), 
	A203("A203", 6), 
	A301("A301", 7), 
	A302("A302", 8);
	
	public final String label;
	public int val;
	
	private PhongHoc (String label, int val) {
		this.label =label;
		this.val = val;
	}
	
	public static PhongHoc nameOfValue(int val) {
		for (PhongHoc i: values()) {
			if (i.val == val) 
				return i;
		}
		return null;
	}
	
	
}
