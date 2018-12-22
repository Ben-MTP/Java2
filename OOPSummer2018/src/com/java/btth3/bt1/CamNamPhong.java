package com.java.btth3.bt1;

import java.util.Date;

public class CamNamPhong extends QuaCam{
	private int giaBan;
	private String xuatXu;
	private String ngayNhap;
	private int soLuong;
	
	public CamNamPhong() {
		super();
	}
	
	public CamNamPhong(int giaBan, String xuatXu, String ngayNhap, int soLuong) {
		super();
		this.setGiaBan(giaBan);
		this.setXuatXu(xuatXu);
		this.setNgayNhap(ngayNhap);
		this.setSoLuong(soLuong);
	}

	public int getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
