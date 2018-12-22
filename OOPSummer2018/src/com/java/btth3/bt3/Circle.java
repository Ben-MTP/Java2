package com.java.btth3.bt3;
/* Hinh tron:
 * */
public class Circle extends Shape{
	private int viTri;
	private int kichThuoc;
	//Constructor:
	public Circle() {
		
	}
	
	public Circle(int viTri, int kichThuoc) {
		this.viTri = viTri;
		this.kichThuoc = kichThuoc;
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
		System.out.println("Cricle is Black");
	}

	void diChuyen() {
		System.out.println("Go to Circle!");
	}
}
