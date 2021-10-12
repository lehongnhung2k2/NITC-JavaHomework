package Buoi7_Bai1.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_Bai1.entity.LichHoc;
import Buoi7_Bai1.entity.LichTruc;

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
