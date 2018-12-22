package com.java.btth4.bt1;
/* Lop hinh chua nhat
 * */
public class Rectangle extends Shape{
	private int viTri;
	private int kichThuoc;
	//Constructor:
	public Rectangle() {
		
	}
	
	public Rectangle(int viTri, int kichThuoc) {
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
		System.out.println("Rectangle is White");
	}

	void diChuyen() {
		System.out.println("Go to Rectangle!");
	}
}
