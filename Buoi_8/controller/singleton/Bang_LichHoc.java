package Buoi_8.controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi_8.model.entity.LichHoc;


public class Bang_LichHoc {
public static List<LichHoc> list_LichHoc = new ArrayList<LichHoc>();
	
	public static boolean addToLichHoc (LichHoc lh) {
		list_LichHoc.add(lh);
		return true;
	}
	
	public static List<LichHoc> getLichHoc(){
		return list_LichHoc;
	}
	
	public static LichHoc getID(int id){
		for (LichHoc i: list_LichHoc) {
			if (i.getId()== id)
				return i;
		}
		return null;
	}
	

}
