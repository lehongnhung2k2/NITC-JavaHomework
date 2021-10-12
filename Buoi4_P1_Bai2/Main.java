package QuanLyTruongHoc;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<MonHoc> list_Mon = new ArrayList<MonHoc>();
		list_Mon.add(new MonHoc("Toán")); 
		list_Mon.add(new MonHoc("Lý")); 
		list_Mon.add(new MonHoc("Hóa")); 
		
		ArrayList<GiaoVien> list_GV = new ArrayList<GiaoVien>();
		list_GV.add(new GiaoVien("Nguyễn Văn A", 30, "02990043", list_Mon.get(0)));
		list_GV.add(new GiaoVien("Nguyễn Văn B", 43, "02984743", list_Mon.get(2)));
		list_GV.add(new GiaoVien("Nguyễn Văn C", 25, "04628384", list_Mon.get(2)));
		list_GV.add(new GiaoVien("Nguyễn Văn D", 39, "03747855", list_Mon.get(1)));
		list_GV.add(new GiaoVien("Nguyễn Văn E", 43, "08647585", list_Mon.get(0)));
		
		ArrayList<BaoVe> list_BV = new ArrayList<BaoVe>();
		list_BV.add(new BaoVe("Trần Thị A", 50, "02374849"));
		list_BV.add(new BaoVe("Trần Thị B", 54, "08849497"));
		list_BV.add(new BaoVe("Trần Thị C", 43, "08833839"));
		list_BV.add(new BaoVe("Trần Thị D", 65, "07364747"));
		list_BV.add(new BaoVe("Trần Thị E", 30, "07474889"));
		
		ArrayList<NV_VeSinh> list_VS = new ArrayList<NV_VeSinh>();
		list_VS.add(new NV_VeSinh("Phạm Văn A",38 , "0374747"));
		list_VS.add(new NV_VeSinh("Phạm Văn B",38 , "0383745"));
		list_VS.add(new NV_VeSinh("Phạm Văn C",38 , "0273764"));
		list_VS.add(new NV_VeSinh("Phạm Văn D",38 , "0548889"));
		list_VS.add(new NV_VeSinh("Phạm Văn E",38 , "0478856"));
		
		ArrayList<HocSinh> list_HS = new ArrayList<HocSinh>();
		list_HS.add(new HocSinh("Lê Hồng A", 19, "0737748"));
		list_HS.add(new HocSinh("Lê Hồng B", 19, "0484889"));
		list_HS.add(new HocSinh("Lê Hồng C", 19, "0937475"));
		list_HS.add(new HocSinh("Lê Hồng D", 19, "0948485"));
		list_HS.add(new HocSinh("Lê Hồng E", 19, "0774885"));
		
		System.out.println("Danh sách giáo viên:");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD(), list_GV.get(i).getmon().mon);
		}
		System.out.println("\n");
		
		System.out.println("Danh sách NV bảo vệ: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
		System.out.println("\n");
		
		System.out.println("Danh sách NV vệ sinh: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
		System.out.println("\n");
		
		System.out.println("Danh sách học sinh: ");
		for (int i=0; i<5; i++)
		{
			System.out.printf("%s, %d, %s\n", list_GV.get(i).getname(), list_GV.get(i).getage(), list_GV.get(i).getCCCD());
		}
	}

}
