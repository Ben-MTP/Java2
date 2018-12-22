package com.java.btth3.b3;
/* Xay dung Shape la lop dai dien cho cac hinh khac nhau.
 * Mot doi tuong Layer chua nhieu Shape
 * */
public class Shape {
	private String name;
	private int viTri;
	private int kichThuoc;
	
	//Constructor cho doi tuong Shape:
	public Shape() {}
	public Shape(int viTri, int kichThuoc) {
		this.viTri = viTri;
		this.kichThuoc = kichThuoc;
	}
	
	//Cac ham set/get khoi tao cho nhung thuoc tinh
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
	
	public String toStringKichThuocViTri() {
		return getName()+" and "+getViTri()+" and "+getKichThuoc();
 	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
