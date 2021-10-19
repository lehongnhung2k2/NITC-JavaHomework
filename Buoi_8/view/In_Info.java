package Buoi_8.view;

import java.util.List;
import java.util.Scanner;

import Buoi_8.controller.singleton.Bang_LichDay;
import Buoi_8.controller.singleton.Bang_LichHoc;
import Buoi_8.controller.singleton.Bang_LichTruc;
import Buoi_8.controller.utils.ScannerUtils;
import Buoi_8.model.entity.NhanVien;
import Buoi_8.model.entity.SinhVien;

public class In_Info {
	
	public static void DS_NV() {
		List<NhanVien> nv = DS_NV.getNV();
		for (NhanVien i: nv) {
			i.show();
		}
	}
	
	public static void DS_SV() {
		List<SinhVien> sv = DS_SV.getSV();
		for (SinhVien i: sv) {
			i.show();
		}
	}
	
	public static void DS() {
		Show.DS();
		Scanner in = new Scanner(System.in);
		int chon= ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 2);
		if (chon ==1) In_Info.DS_NV();
		else In_Info.DS_SV();
	}
	
	public static void lich() {
		System.out.println("In lich làm việc");
		System.out.println("Chọn '0' để dừng xem");
		Scanner in = new Scanner(System.in);
		int id=-1;
		while(true) {
			if (id==0) break;
			System.out.println("Mời bạn nhập id");
			id = ScannerUtils.readId(in, "Bạn phải nhập 1 số");
			
			if (DS_NV.getGV(id)!=null) {
				System.out.println("Tên: " +DS_NV.getGV(id));
				if (Bang_LichDay.getID(id)!=null)
					System.out.println("Phòng: "+ Bang_LichDay.getID(id).getPhong()+ " | Thời gian: "+ Bang_LichDay.getID(id).getTime());
				else System.out.println("Chưa có lịch nào");
			}
			
			
			if(DS_NV.getNVV(id)!= null) {
				System.out.println("Tên: " +DS_NV.getNVV(id));
				if (Bang_LichTruc.getID(id)!=null)
					System.out.println("Vị trí: "+ Bang_LichTruc.getID(id).getViTri()+ " | Thời gian: "+ Bang_LichTruc.getID(id).getTime());
				else System.out.println("Chưa có lịch nào");
			}
			
			
			if(DS_SV.getId(id)!=null) {
				System.out.println("Tên: " +DS_SV.getId(id));
				if (Bang_LichHoc.getID(id)!=null)
					System.out.println("Phòng: "+ Bang_LichHoc.getID(id).getPhong()+ " | Thời gian: "+ Bang_LichHoc.getID(id).getTime());
				else System.out.println("Chưa có lịch nào");
			}
			
		}
	}

}
