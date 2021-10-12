package Buoi7_Bai1.entity;

import Buoi7_Bai1.enumPackage.PhongHoc;

public class LichGiangDay extends Lich_LamViec{
	private int phong;

	public LichGiangDay(int id, int time, int phong) {
		super(id, time);
		this.phong = phong;
	}

	public String getPhong() {
		PhongHoc x = PhongHoc.nameOfValue(phong);
		return x.label;
	}

	public void setPhong(int phong) {
		this.phong = phong;
	}
	
	

}
