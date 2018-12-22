package com.java.btth3.b3;

public class Square extends Shape{
	public Square() {
		super();
	}
	public Square(String name, int viTri, int kichThuoc) {
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
