package com.java.btth3.bt1;

import java.util.Date;

public class CamSanh extends QuaCam {
	private int giaBan;
	private String xuatXu;
	private String ngayNhap;
	private int soLuong;
	
	public CamSanh() {
		super();
	}
	public CamSanh(int giaBan, String xuatXu, String ngayNhap, int soLuong) {
		super();
		this.giaBan = giaBan;
		this.xuatXu = xuatXu;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
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
