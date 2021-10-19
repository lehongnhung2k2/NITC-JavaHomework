package Buoi_8.view;

import java.util.Scanner;

import Buoi_8.controller.singleton.Bang_LichDay;
import Buoi_8.controller.singleton.Bang_LichHoc;
import Buoi_8.controller.singleton.Bang_LichTruc;
import Buoi_8.controller.singleton.DS_NV;
import Buoi_8.controller.singleton.DS_SV;
import Buoi_8.controller.utils.ScannerUtils;
import Buoi_8.model.entity.LichGiangDay;
import Buoi_8.model.entity.LichHoc;
import Buoi_8.model.entity.LichTruc;
import Buoi_8.model.entity.NhanVien;
import Buoi_8.model.entity.SinhVien;


public class Nhap_Info {
	public static void info_NS() {
		Scanner in = new Scanner(System.in);
		//String name = null;
		
		System.out.println("Họ tên: ");
		String name = ScannerUtils.readString(in, "Bạn phải nhập đúng ký tự");
		
		System.out.println("Tuổi: ");
		int age = ScannerUtils.readInt(in, "Bạn phải nhập 1 số");
		
		System.out.println("Giới tính: ");
		Show.GioiTinh();
		int gt = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 3);
		
		System.out.println("Chức vụ: ");
		Show.ChucVu();
		int cv = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 4);
		
		if (cv==4) {
			System.out.println("Loại đào tạo: ");
			Show.type();
			int type = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 4);
			DS_SV.addToSV(new SinhVien(name, age, gt, cv, type));
			
		}
		
		else {
			DS_NV.addToNV(new NhanVien(name, age, gt, cv));
		}
		
	}
	
	
	public static void info_Lich() {
		while(true) {
			System.out.println("Bạn muốn thêm lịch làm việc của?");
			Scanner in = new Scanner(System.in);
			Show.lich();
			int lich = in.nextInt();
			if (lich==0) break;
			
			int idNS = -1, vitri;
			System.out.println("Mời bạn nhập thông tin");
			System.out.println("Id của người cần thêm: ");
			switch (lich) {
				case 1: {
					idNS= ScannerUtils.readID_NV(in, "Bạn phải nhập 1 số");
					break;
				}
				case 2:{
					idNS= ScannerUtils.readID_GV(in, "Bạn phải nhập 1 số");
					break;
				}
				default:{
					idNS= ScannerUtils.readID_SV(in, "Bạn phải nhập 1 số");
					break;
				}
			}
		
			System.out.println("Thời gian: ");
			int time = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 8);
			
			if (lich==1) {
				System.out.println("Vị trí: ");
				vitri = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 7);
			}
			else {
				System.out.println("Phòng học: ");
				vitri = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 8);
			}
			
			switch (lich) {
			case 1: {
				Bang_LichTruc.addToLichTruc(new LichTruc(idNS, time, vitri));
				break;
			}
			case 2:{
				Bang_LichDay.addToLichDay(new LichGiangDay(idNS, time, vitri));
				break;
			}
			default:{
				Bang_LichHoc.addToLichHoc(new LichHoc(idNS, time, vitri));
			}
				
			}
			
		}
	}
	
	

}
