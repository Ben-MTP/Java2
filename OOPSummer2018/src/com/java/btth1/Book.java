package com.java.btth1;

public class Book {
	private String tensach;
	private int sl;
	private int sldamuon;
	//Phuong thuc khoi tao: 
	public Book(String tensach, int sl) {
		this.tensach = tensach;
		this.sl = sl;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public int getSldamuon() {
		return sldamuon;
	}
	public void setSldamuon(int sldamuon) {
		this.sldamuon = sldamuon;
	}
	
	public String In() {
		return "Ten sach: "+this.tensach +"va So luong: "+ this.sl;
	}
	
	public int Soluongconlai() {
		return (sl - sldamuon);
	}
}
