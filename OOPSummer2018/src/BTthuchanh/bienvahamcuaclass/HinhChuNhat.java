package BTthuchanh.bienvahamcuaclass;

public class HinhChuNhat {
	//1. Khi khoi tao bien va ham cua class dung static # bien ham cua doi tuong
	static int count = 100;
	
	static String name = "Hinh chu nhat";
	
	static double chuVi(double chieuDai, double chieuRong) {
		return(chieuDai + chieuRong) * 2;
	}
	
	static double dienTich(double chieuDai, double chieuRong) {
		return(chieuDai * chieuRong);
	}
}
