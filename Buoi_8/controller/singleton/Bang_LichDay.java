package Buoi_8.controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi_8.model.entity.LichGiangDay;


public class Bang_LichDay {
public static List<LichGiangDay> list_LichDay = new ArrayList<LichGiangDay>();
	
	public static boolean addToLichDay (LichGiangDay ld) {
		list_LichDay.add(ld);
		return true;
	}
	
	public static List<LichGiangDay> getLichDay(){
		return list_LichDay;
	}
	
	public static LichGiangDay getID(int id){
		for (LichGiangDay i: list_LichDay) {
			if (i.getId()== id)
				return i;
		}
		return null;
	}

}
