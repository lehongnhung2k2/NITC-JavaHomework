package Buoi_8.model.entity;

import Buoi_8.model.enumPackage.PhongHoc;

public class LichHoc extends Lich_LamViec{
	private int phong;

	public LichHoc(int id, int time, int phong) {
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
