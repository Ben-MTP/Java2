package com.java.btth2;

public class MayTinh {
	private String tenMay;
	private int trongLuong;
	//1. Phuong thuc khoi tao:
	public MayTinh() {
		
	}
	
	public MayTinh(String tenMay, int trongLuong) {
		this.setTenMay(tenMay);
		this.setTrongLuong(trongLuong);
	}

	public String getTenMay() {
		return tenMay;
	}

	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}

	public int getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(int trongLuong) {
		this.trongLuong = trongLuong;
	}
	
	//Phuong thuc:
	public void batTat() {
		//Enter method:
	}
}
