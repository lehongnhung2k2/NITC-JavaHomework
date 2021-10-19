package Buoi_8.controller.utils;

import java.util.Scanner;

import Buoi_8.controller.singleton.DS_NV;
import Buoi_8.controller.singleton.DS_SV;

public class ScannerUtils {
	public static String readString(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				String name = scanner.nextLine().trim();
				if (name != null & !name.isEmpty()) {
					return name;
				}
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readInt(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readInt(Scanner scanner, String errorMessage, int min, int max) {
		while (true) {
			try {
				int x= Integer.parseInt(scanner.nextLine());
				if (x<min || x>max) {
					System.out.printf("Error: Bạn phải nhập 1 số lớn hơn %d và nhỏ hơn %d\n", min, max);
					System.out.println("Mời bạn nhập lại");
				}
				else return x;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readID_NV(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				int x= Integer.parseInt(scanner.nextLine());
				if (DS_NV.getNVV(x) == null) {
					System.out.println("Error: Không có nhân viên nào có id này");
					System.out.println("Mời bạn nhập lại");
				}
				else return x;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readID_GV(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				int x= Integer.parseInt(scanner.nextLine());
				if (DS_NV.getGV(x) == null) {
					System.out.println("Error: Không có giảng viên nào có id này");
					System.out.println("Mời bạn nhập lại");
				}
				else return x;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readID_SV(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				int x= Integer.parseInt(scanner.nextLine());
				if (DS_SV.getId(x)== null) {
					System.out.println("Error: Không có sinh viên nào có id này");
					System.out.println("Mời bạn nhập lại");
				}
				else return x;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	public static int readId(Scanner scanner, String errorMessage) {
		while (true) {
			try {
				int x= Integer.parseInt(scanner.nextLine());
				if (DS_SV.getId(x)== null && DS_NV.getGV(x) == null && DS_NV.getNVV(x) == null) {
					System.out.println("Error: Không có người nào có id này");
					System.out.println("Mời bạn nhập lại");
				}
				else return x;
			} catch (Exception e) {
				showError(errorMessage);
			}
		}
	}
	
	private static void showError (String message) {
		System.out.println("Error: " + message);
	}

}
