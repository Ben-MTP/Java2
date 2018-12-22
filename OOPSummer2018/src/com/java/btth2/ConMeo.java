package com.java.btth2;

public class ConMeo extends Animal{
	private String mauLong;
	private float canNang;
	
	//1. Phuong thuc khoi tao:
	public ConMeo() {
		
	}
	
	public ConMeo(String mauLong, float canNang) {
		this.setMauLong(mauLong);
		this.setCanNang(canNang);
	}

	//2. Phuong thuc setter, getter:
	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public float getCanNang() {
		return canNang;
	}

	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}
	
	//Phuong thuc:
	public void run() {
		//Enter method:
	}
	
	public void batChuot() {
		//Enter method:
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Keu theo kieu con meo!");
	}
	
	@Override
	public void eat() {
		System.out.println("An theo kieu con Meo!");
	}
	
	
}
