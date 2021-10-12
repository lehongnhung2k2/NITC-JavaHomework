package ThuVien_Main;

import java.util.ArrayList;
import java.util.Scanner;

import ThuVien.Sach;
import ThuVien.Tacgia;
import ThuVien.Trangthai;

public class Main {
	public static void main(String[] args) {
		ArrayList<Trangthai> l_Trangthai = new ArrayList<Trangthai>();
		l_Trangthai.add(new Trangthai("Trong kho"));
		l_Trangthai.add(new Trangthai("Trưng bày"));
		l_Trangthai.add(new Trangthai("Đã cho mượn"));
		
		
		ArrayList<Tacgia> l_Tacgia = new ArrayList<Tacgia>();
		l_Tacgia.add(new Tacgia("Tô Hoài"));
		l_Tacgia.add(new Tacgia("Xuân Quỳnh"));
		l_Tacgia.add(new Tacgia("Xuân Diệu"));
		l_Tacgia.add(new Tacgia("Trần Đăng Khoa"));
		
		ArrayList<Sach> l_Sach = new ArrayList<Sach>();
		l_Sach.add(new Sach("001", "Dế Mèn phiêu lưu ký", l_Tacgia.get(0), l_Trangthai.get(0)));
		l_Sach.add(new Sach("002", "Dế Mèn phiêu lưu ký", l_Tacgia.get(0), l_Trangthai.get(1)));
		l_Sach.add(new Sach("003", "Dế Mèn phiêu lưu ký", l_Tacgia.get(0), l_Trangthai.get(2)));
		l_Sach.add(new Sach("004", "Dế Mèn phiêu lưu ký", l_Tacgia.get(0), l_Trangthai.get(2)));
		l_Sach.add(new Sach("005", "Dế Mèn phiêu lưu ký", l_Tacgia.get(0), l_Trangthai.get(0)));
		l_Sach.add(new Sach("006", "Quê người", l_Tacgia.get(0), l_Trangthai.get(0)));
		l_Sach.add(new Sach("007", "Quê người", l_Tacgia.get(0), l_Trangthai.get(2)));
		l_Sach.add(new Sach("008", "Quê người", l_Tacgia.get(0), l_Trangthai.get(1)));
		l_Sach.add(new Sach("009", "Quê người", l_Tacgia.get(0), l_Trangthai.get(0)));
		
		l_Sach.add(new Sach("010", "Tơ tằm", l_Tacgia.get(1), l_Trangthai.get(0)));
		l_Sach.add(new Sach("011", "Tơ tằm", l_Tacgia.get(1), l_Trangthai.get(1)));
		l_Sach.add(new Sach("012", "Tơ tằm", l_Tacgia.get(1), l_Trangthai.get(0)));
		l_Sach.add(new Sach("013", "Gió Lào", l_Tacgia.get(1), l_Trangthai.get(1)));
		l_Sach.add(new Sach("014", "Gió Lào", l_Tacgia.get(1), l_Trangthai.get(2)));
		l_Sach.add(new Sach("015", "Gió Lào", l_Tacgia.get(1), l_Trangthai.get(1)));
		l_Sach.add(new Sach("016", "Gió Lào", l_Tacgia.get(1), l_Trangthai.get(0)));
		
		l_Sach.add(new Sach("017", "Thơ thơ", l_Tacgia.get(2), l_Trangthai.get(1)));
		l_Sach.add(new Sach("018", "Thơ thơ", l_Tacgia.get(2), l_Trangthai.get(0)));
		l_Sach.add(new Sach("019", "Thơ thơ", l_Tacgia.get(2), l_Trangthai.get(1)));
		l_Sach.add(new Sach("020", "Thơ thơ", l_Tacgia.get(2), l_Trangthai.get(2)));
		l_Sach.add(new Sach("021", "Mẹ con", l_Tacgia.get(2), l_Trangthai.get(0)));
		l_Sach.add(new Sach("022", "Mẹ con", l_Tacgia.get(2), l_Trangthai.get(1)));
		l_Sach.add(new Sach("023", "Mẹ con", l_Tacgia.get(2), l_Trangthai.get(1)));
		
//		System.out.println(l_Sach.get(1).getTrangthai().getTT());
		
		System.out.println("Nhập tên sách: ");
		Scanner input= new Scanner(System.in);
		String name;
		name= input.nextLine();
		
		int SL=0;
		for (int i=0; i<23; i++)
		{
			if (name.equals(l_Sach.get(i).getName()))
			{
				System.out.printf("%s, %s, %s, %s \n", l_Sach.get(i).getMa(), l_Sach.get(i).getName(), l_Sach.get(i).getTG().getTG(), l_Sach.get(i).getTrangthai().getTT());
				++SL;
			}
		}
		System.out.printf("Số lượng sách: %d", SL);
	}

}
