package com.java.btth3.bt3;
/* Lop tam giac
 * co thuoc tinh viTri, kichThuoc
 * co thuoc tinh toMau, diChuyen
 * */
public class Triangle extends Shape{
	private int viTri;
	private int kichThuoc;
	//Constructor:
	public Triangle() {
		
	}
	
	public Triangle(int viTri, int kichThuoc) {
		this.viTri = viTri;
		this.kichThuoc = kichThuoc;
	}
	
	public Triangle(String name) {
		super.setName(name);
	}
	public int getViTri() {
		return viTri;
	}
	
	public void setViTri(int viTri) {
		this.viTri = viTri;
	}
	public int getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(int kichThuoc) {
		this.kichThuoc = kichThuoc;
	}

	void toMau() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is Red");
	}

	void diChuyen() {
		// TODO Auto-generated method stub
		System.out.println("Go to Triangle!");
	}
	
}
