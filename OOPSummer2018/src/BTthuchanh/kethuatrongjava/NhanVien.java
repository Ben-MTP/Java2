package BTthuchanh.kethuatrongjava;

public class NhanVien extends Person {
	static double luong = 1000.0;
	/*
	name = "Minh Manh";
	age = 20;
	address = "Thai Binh";
	*/
	public static void mucLuong() {
		System.out.println("Muc luong cua NV: " + luong);
	}
	
	/*
	//1. Tao doi tuong NhanVien:
	static NhanVien nhanvien = new NhanVien();
	public static String In() {
		
		return nhanvien.getName() +" "+ nhanvien.getAge()+" "+ nhanvien.getAddress();
	}
	*/
}
