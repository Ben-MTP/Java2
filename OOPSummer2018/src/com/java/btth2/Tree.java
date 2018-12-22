package com.java.btth2;

public class Tree {
	private String tenCay;
	private float chieuCao;
	
	public Tree() {
		
	}
	
	public Tree(String tenCay, float chieuCao) {
		this.setTenCay(tenCay);
		this.setChieuCao(chieuCao);
	}

	public String getTenCay() {
		return tenCay;
	}

	public void setTenCay(String tenCay) {
		this.tenCay = tenCay;
	}

	public float getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(float chieuCao) {
		this.chieuCao = chieuCao;
	}
	
	
}
