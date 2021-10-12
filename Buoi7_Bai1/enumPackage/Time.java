package Buoi7_Bai1.enumPackage;

public enum Time {
	TIET1 ("6h45- 8h", 1),
	TIET2 ("8h10- 9h25", 2),
	TIET3 ("9h35- 10h50", 3),
	TIET4 ("11h- 12h15", 4),
	TIET5 ("13h- 14h15", 5),
	TIET6 ("14h25- 15h40", 6),
	TIET7 ("15h50- 17h05", 7),
	TIET8 ("17h15- 18h30", 8);

	public final String label;
	public int val;

	private Time(String label, int val) {
		this.label = label;
		this.val = val;
	}
	
	public static Time nameOfValue (int val) {
		for (Time i: values()) {
			if (i.val == val) 
				return i;
		}
		return null;
	}
	
	
}
