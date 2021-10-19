package Buoi_8.controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi_8.model.entity.SinhVien;


public class DS_SV {
public static List<SinhVien> DS_SV = new ArrayList<SinhVien>();
	
	public static boolean addToSV(SinhVien sv) {
		DS_SV.add(sv);
		return true;
	}
	
	public static List<SinhVien> getSV() {
		return DS_SV;
	}
	
	public static String getId(int id) {
		for (SinhVien i: DS_SV) {
			if (i.getId() == id)
				return i.getName();
		}
		return null;
	}
	
}
