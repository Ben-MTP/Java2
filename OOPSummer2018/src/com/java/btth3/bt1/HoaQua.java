package com.java.btth3.bt1;

public class HoaQua {
	private String tenHoaQua;
	private String hinhDang;
	private String mauSac;
	public HoaQua() {}
	public HoaQua(String tenHoaQua, String hinhDang, String mauSac) {
		this.tenHoaQua = tenHoaQua;
		this.hinhDang = hinhDang;
		this.mauSac = mauSac;
	}
	public String getTenHoaQua() {
		return tenHoaQua;
	}
	public void setTenHoaQua(String tenHoaQua) {
		this.tenHoaQua = tenHoaQua;
	}
	public String getHinhDang() {
		return hinhDang;
	}
	public void setHinhDang(String hinhDang) {
		this.hinhDang = hinhDang;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	public String In() {
		return tenHoaQua+"| "+hinhDang+"| "+mauSac;
	}
	
}
