package com.java.btth3.b3;

public class Triangle extends Shape{
	public Triangle() {
		super();
	}
	public Triangle(String name, int viTri, int kichThuoc) {
		super.setName(name);
		super.setViTri(viTri);
		super.setKichThuoc(kichThuoc);
	}
	
	public void toMau() {
		System.out.println("to mau do");
	}
	public void diChuyen() {
		System.out.println("di chuyen ngang");
	}
}
