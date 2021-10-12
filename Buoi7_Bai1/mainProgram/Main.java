package Buoi7_Bai1.mainProgram;

import java.util.List;
import java.util.Scanner;

import Buoi7_Bai1.entity.LichGiangDay;
import Buoi7_Bai1.entity.LichHoc;
import Buoi7_Bai1.entity.LichTruc;
import Buoi7_Bai1.entity.NhanVien;
import Buoi7_Bai1.entity.SinhVien;
import Buoi7_Bai1.singleton.Bang_LichDay;
import Buoi7_Bai1.singleton.Bang_LichHoc;
import Buoi7_Bai1.singleton.Bang_LichTruc;
import Buoi7_Bai1.singleton.DS_NV;
import Buoi7_Bai1.singleton.DS_SV;

public class Main {
	public static void main(String[] args) {
		//Danh sach 
		DS_SV.addToSV(new SinhVien("Nhung", 19, 2, 4, 1));
		DS_SV.addToSV(new SinhVien("Duc", 19, 1, 4, 1));
		DS_SV.addToSV(new SinhVien("Thang", 19, 1, 4, 2));
		DS_SV.addToSV(new SinhVien("Thao", 19, 2, 4, 3));
		List<SinhVien> sv = DS_SV.getSV();
		
		DS_NV.addToNV(new NhanVien("Tan", 20, 3, 3));
		DS_NV.addToNV(new NhanVien("Duc", 21, 2, 3));
		DS_NV.addToNV(new NhanVien("Dat", 20, 2, 3));
		DS_NV.addToNV(new NhanVien("Ngoc", 22, 2, 3));
		DS_NV.addToNV(new NhanVien("Nguyen", 30, 2, 2));
		DS_NV.addToNV(new NhanVien("Hong", 50, 1, 1));
		DS_NV.addToNV(new NhanVien("Hung", 34, 2, 2));
		DS_NV.addToNV(new NhanVien("Mai", 40, 1, 1));
		List<NhanVien> nv = DS_NV.getNV();
		
		//Lich lam viec
		Bang_LichHoc.addToLichHoc(new LichHoc(1, 2, 3));
		Bang_LichHoc.addToLichHoc(new LichHoc(3, 2, 3));
		Bang_LichHoc.addToLichHoc(new LichHoc(2, 1, 2));
		Bang_LichHoc.addToLichHoc(new LichHoc(4, 1, 3));
		List<LichHoc> hoc = Bang_LichHoc.getLichHoc();
		
		Bang_LichDay.addToLichDay(new LichGiangDay(1, 2, 3));
		Bang_LichDay.addToLichDay(new LichGiangDay(3, 2, 3));
		Bang_LichDay.addToLichDay(new LichGiangDay(2, 1, 2));
		Bang_LichDay.addToLichDay(new LichGiangDay(4, 4, 2));
		
		Bang_LichTruc.addToLichTruc(new LichTruc(5, 3, 2));
		Bang_LichTruc.addToLichTruc(new LichTruc(6, 4, 2));
		Bang_LichTruc.addToLichTruc(new LichTruc(7, 3, 1));
		Bang_LichTruc.addToLichTruc(new LichTruc(8, 2, 2));
		
		Scanner in = new Scanner(System.in);
		int luachon, id;
		
		System.out.println("Bạn muốn xem thông tin của: ");
		System.out.println("\t1. Nhân viên");
		System.out.println("\t2. Sinh viên");
		
		luachon = in.nextInt();
		
		switch (luachon) {
		case 1: {
			for (NhanVien i: nv)
				i.show();
			break;
		}
		default:{
			for (SinhVien i: sv)
				i.show();
				break;	
		}
		}
		
		System.out.println("Bạn muốn xem lịch làm việc, lịch học của: ");
		System.out.println("\t1. Nhân viên");
		System.out.println("\t2. Giảng viên");
		System.out.println("\t3. Sinh viên");
		
		
		luachon = in.nextInt();
		
		switch (luachon) {
		case 1: {
			System.out.println("Nhập id: ");
			id = in.nextInt();
			if (DS_NV.getNVV(id)!=null) System.out.println("Tên: " +DS_NV.getNVV(id));
			if (Bang_LichTruc.getID(id)!=null)
				System.out.println("Vị trí: "+ Bang_LichTruc.getID(id).getViTri()+ " | Thời gian: "+ Bang_LichTruc.getID(id).getTime());
			break;
		}
		case 2:{
			System.out.println("Nhập id: ");
			id = in.nextInt();
			if (DS_NV.getGV(id)!=null) System.out.println("Tên: " +DS_NV.getGV(id));
			if (Bang_LichDay.getID(id)!=null)
				System.out.println("Phòng: "+ Bang_LichDay.getID(id).getPhong()+ " | Thời gian: "+ Bang_LichDay.getID(id).getTime());
			break;
		}
		default:{
			System.out.println("Nhập id: ");
			id = in.nextInt();
			if (DS_SV.getId(id)!=null) System.out.println("Tên: " +DS_SV.getId(id));
			if (Bang_LichHoc.getID(id)!=null)
				System.out.println("Phòng: "+ Bang_LichHoc.getID(id).getPhong()+ " | Thời gian: "+ Bang_LichHoc.getID(id).getTime());
			break;
		}
		}
	}

}
