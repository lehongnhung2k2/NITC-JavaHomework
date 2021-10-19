package Buoi_8.model.entity;

import Buoi_8.model.enumPackage.ViTri;

public class LichTruc extends Lich_LamViec{
	private int viTri;

	public LichTruc(int id, int time, int viTri) {
		super(id, time);
		this.viTri = viTri;
	}

	public String getViTri() {
		ViTri x = ViTri.nameOfValue(viTri);
		return x.label;
	}

	public void setViTri(int viTri) {
		this.viTri = viTri;
	}
	
	

}
