package Buoi_8.controller.main;

import java.util.Scanner;

import Buoi_8.controller.utils.ScannerUtils;
import Buoi_8.view.In_Info;
import Buoi_8.view.Nhap_Info;

public class Main {
	public static void main(String[] args) {
		System.out.println("Nhập vào số nhân sự: ");
		Scanner in= new Scanner(System.in);
		int n= ScannerUtils.readInt(in, "Bạn phải nhập 1 số");
		for (int i=1; i<=n; i++) {
			System.out.printf("Mời bạn nhập thông tin của nhân sự thứ %d: \n", i);
			Nhap_Info.info_NS();
		}
		
		System.out.println("Thêm lịch làm việc");
		System.out.println("Chọn '0' để dừng lại");
		Nhap_Info.info_Lich();
		
		System.out.println("Bạn muốn: ");
		System.out.println("1. Xem danh sách nhân sự");
		System.out.println("2. Xem lịch làm việc");
		int chon = ScannerUtils.readInt(in, "Bạn phải nhập 1 số", 1, 2);
		if (chon==1) In_Info.DS();
		else In_Info.lich();
		
		
	}

}
