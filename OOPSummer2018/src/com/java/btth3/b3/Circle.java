package com.java.btth3.b3;

public class Circle extends Shape{
	public Circle() {}
	public Circle(String name, int viTri, int kichThuoc) {
		super.setName(name);
		super.setKichThuoc(kichThuoc);
		super.setViTri(viTri);
	}
	
	//Thu khoi tao phuong thuc set/get cho doi tuong nay:
	@Override
	public void setViTri(int viTri) {
		//Dich chuyen len mot thang moi:
		viTri = viTri + 10;
		super.setViTri(viTri);
	}
	
	//Phuong thuc toMau, dichChuyen:
	public void toMau() {
		System.out.println("dang to mau");
	}
	public void dichChuyen() {
		System.out.println("dang dich chuyen");
	}

}
