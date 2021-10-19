package Buoi_8.controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi_8.model.entity.LichTruc;


public class Bang_LichTruc {
public static List<LichTruc> list_LichTruc = new ArrayList<LichTruc>();
	
	public static boolean addToLichTruc (LichTruc lt) {
		list_LichTruc.add(lt);
		return true;
	}

	public static List<LichTruc> getLichTruc(){
		return list_LichTruc;
	}

	public static LichTruc getID(int id){
		for (LichTruc i: list_LichTruc) {
			if (i.getId()== id)
				return i;
		}
		return null;
	}
}
