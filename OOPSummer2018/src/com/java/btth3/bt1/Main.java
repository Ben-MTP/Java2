package com.java.btth3.bt1;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//1. Khoi tao doi tuong HoaQua:
		HoaQua hoaQua = new HoaQua("Qua Buoi","Hinh cau", "Mau xanh");
		System.out.println(hoaQua.In());
		
		//2. Khoi tao doi tuong QuaTao:
		QuaTao quaTao = new QuaTao("Vua chua vua ngot");
		quaTao.setTenHoaQua("Qua Tao");
		quaTao.setHinhDang("Hinh cau");
		quaTao.setMauSac("Mau do");
		System.out.println(quaTao.getTenHoaQua()+"| "+quaTao.getHinhDang()+"| "+quaTao.getMauSac()+"| "+quaTao.getHuongVi());
		
		//3. Doi tuong CamNamPhong:
		//String pattern ="dd-MM=yy";
		
		CamNamPhong camNamPhong = new CamNamPhong(15000, "Thai Binh", "01/02/2017", 1000);
		camNamPhong.setTenHoaQua("Cam Nam Phong");
		camNamPhong.setHinhDang("Hinh cau");
		camNamPhong.setMauSac("Mau vang");
		System.out.println(camNamPhong.getTenHoaQua()+"| "+camNamPhong.getHinhDang()+"| "+camNamPhong.getMauSac());
		System.out.println(camNamPhong.getGiaBan()+"VND/1kg| "+camNamPhong.getXuatXu()+"| Ngay nhap: "+camNamPhong.getNgayNhap()+"| "+camNamPhong.getSoLuong()+" kilogram");
		
		//4. Doi tuong CamSanh:
		CamSanh camSanh = new CamSanh(20000, "Thai Nguyen", "20/01/2017", 1500);
		camSanh.setTenHoaQua("Cam Sanh");
		camSanh.setHinhDang("Hinh cau");
		camSanh.setMauSac("Mau vang");
		System.out.println(camSanh.getTenHoaQua()+"| "+camSanh.getHinhDang()+"| "+camSanh.getMauSac());
		System.out.println(camSanh.getGiaBan()+"VND/1kg| "+camSanh.getXuatXu()+"| Ngay nhap: "+camSanh.getNgayNhap()+"| "+camSanh.getSoLuong()+" kilogram");

	}

}
