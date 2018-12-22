package BTthuchanh.coban;

public class Main {
	public static void main(String [] args) {
		float canhHinhVuong = 12.12f;
		float chuViHinhVuong = HinhVuong.chuVi(canhHinhVuong);
		float dienTichHinhVuong = HinhVuong.dienTich(canhHinhVuong);
		
		System.out.println("Dhv: " + chuViHinhVuong +" Shv: "+dienTichHinhVuong);
		float chieuDai = 11.11f;
		float chieuRong = 12.11f;
		System.out.println("Dhcn: "+ HinhChuNhat.chuVi(chieuDai, chieuRong) +" Shcn: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
		
		System.out.println("Dht: "+HinhTron.chuVi(12.44f) + " Sht: " + HinhTron.dienTich(12.44f));
		
	}
}
