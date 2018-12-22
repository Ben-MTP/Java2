package com.java.btth3.b3;

public class Rectangle extends Shape {
	public Rectangle() {
		super();
	}
	
	public Rectangle(String name, int viTri, int kichThuoc) {
		super.setName(name);
		super.setViTri(viTri);
		super.setKichThuoc(kichThuoc);
	}
}
