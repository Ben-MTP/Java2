package com.java.btth2;

public class LapTrinhVien {
	private String name;
	private int age;
	private int soNamKinhNghiem;
	private String ngonNguLapTrinh;
	
	//Phuong thuc khoi tao:
	public LapTrinhVien() {
		
	}
	
	public LapTrinhVien(String name, int age, int soNamKinhNghiem, String ngonNguLapTrinh) {
		this.setName(name);
		this.setAge(age);
		this.setSoNamKinhNghiem(soNamKinhNghiem);
		this.setNgonNguLapTrinh(ngonNguLapTrinh);
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

	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		this.soNamKinhNghiem = soNamKinhNghiem;
	}

	public String getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}

	public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	
	public void lamViec() {
		//Enter Method:
	}
	
}
