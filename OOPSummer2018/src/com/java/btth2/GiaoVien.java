package com.java.btth2;

public class GiaoVien {
	private String name;
	private int age;
	private String adress;
	private String truongHoc;
	
	//1. Contructo mac dinh:
	public GiaoVien() {
		
	}
	
	//2. Constucto day du tham so:
	public GiaoVien(String name, int age, String adress, String truongHoc) {
		this.setName(name);
		this.setAge(age);
		this.setAdress(adress);
		this.setTruongHoc(truongHoc);
	}

	//getter, setter:
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTruongHoc() {
		return truongHoc;
	}

	public void setTruongHoc(String truongHoc) {
		this.truongHoc = truongHoc;
	}
	
	//Phuong thuc:
	public void diemDanh() {
		//Enter method:
	}
	
	public void chamBai() {
		//Enter method:
	}
	
	
}
