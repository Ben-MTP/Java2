package BTthuchanh.bienvahamcuaclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HinhChuNhat.count);
		
		//Thay doi gia tri:
		HinhChuNhat.name = "Day khong phai la HCN";
		System.out.println(HinhChuNhat.name);
		
		System.out.println(HinhChuNhat.chuVi(12.6, 16.8));
		
		System.out.println(HinhChuNhat.dienTich(12.6, 16.8));
		
		//1. Khoi tao 1 constructo khong tham so va thay doi gia tri cua class
		HinhChuNhat hinh1 = new HinhChuNhat();
		hinh1.count = 1010;
		System.out.println(hinh1.count);
		
		hinh1.name = "No lai la 1 HCN binh thuong";
		System.out.println(hinh1.name);
		
		System.out.println(hinh1.chuVi(12.6, 16.8));
		System.out.println(hinh1.dienTich(12.6, 16.8));
	}

}
