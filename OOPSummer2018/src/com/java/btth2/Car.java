package com.java.btth2;

public class Car {
	private String mauSac;
	private double canNang;
	
	public Car() {
		
	}
	
	
	public Car(String mauSac, double canNang) {
		this.setMauSac(mauSac);
		this.setCanNang(canNang);
	}


	public String getMauSac() {
		return mauSac;
	}


	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}


	public double getCanNang() {
		return canNang;
	}


	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	
	//Phuong thuc:
	public void go() {
		//Enter method:
	}
	
}
