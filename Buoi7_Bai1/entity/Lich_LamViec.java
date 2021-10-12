package Buoi7_Bai1.entity;

import Buoi7_Bai1.enumPackage.Time;

public abstract class Lich_LamViec {
	private int id;
	private int time;
	
	public Lich_LamViec(int id, int time) {
		super();
		this.id = id;
		this.time = time;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTime() {
		Time x = Time.nameOfValue(time);
		return x.label;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	

}
