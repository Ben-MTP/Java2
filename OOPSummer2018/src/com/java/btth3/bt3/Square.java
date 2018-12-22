package com.java.btth3.bt3;
/* Hinh bat ki
 * */
public class Square extends Shape{
	private int viTri;
	private int kichThuoc;
	//Constructor:
	public Square() {
		
	}
	
	public Square(int viTri, int kichThuoc) {
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
		System.out.println("Square is Blue");
	}

	void diChuyen() {
		System.out.println("Go to Square!");
	}
}
