package Buoi_8.controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi_8.model.entity.NhanVien;


public class DS_NV {
public static List<NhanVien> DS_NV = new ArrayList<NhanVien>();
	
	public static boolean addToNV(NhanVien nv) {
		DS_NV.add(nv);
		return true;
	}
	
	public static List<NhanVien> getNV() {
		return DS_NV;
	}
	
	public static String getNVV(int id) {
		for (NhanVien i: DS_NV) {
			if (i.getId() == id && (i.getCV().equals("Bảo vệ") || i.getCV().equals("Vệ sinh")))
				return i.getName();
		}
		return null;
	}
	
	public static String getGV(int id) {
		for (NhanVien i: DS_NV) {
			if (i.getId() == id && i.getCV().equals("Giảng viên"))
				return i.getName();
		}
		return null;
	}

}
