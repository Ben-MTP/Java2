package com.java.btth2;

public class TongThong {
	private String name;
	private int age;
	private String quocGia;
	
	//Phuong thuc khoi tao:
	public TongThong() {
		
	}
	
	public TongThong(String name, int age, String quocGia) {
		this.setName(name);
		this.setAge(age);
		this.setQuocGia(quocGia);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	//Phuong thuc:
	public void phatBieu() {
		//Enter method:
	}
}
