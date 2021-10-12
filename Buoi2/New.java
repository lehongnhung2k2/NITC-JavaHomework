package BTVN2;

public class New {
	private int x1, x2, y1, y2;
	public void setx1 ( int x1) {
		this.x1= x1;
	}
	public int getx1 () {
		return this.x1;
	}
	
	public void setx2 ( int x2) {
		this.x2= x2;
	}
	public int getx2 () {
		return this.x2;
	}
	
	public void sety1 ( int y1) {
		this.y1= y1;
	}
	public int gety1 () {
		return this.y1;
	}
	
	public void sety2 ( int y2) {
		this.y2= y2;
	}
	public int gety2 () {
		return this.y2;
	}
	
	public New (int x1, int x2, int y1, int y2) {
		this.x1= x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double length() {
		//return Math.sqrt(x1+x2+y1+y2);
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
	
	
}
