package com.java.btth4.bt3;

public class NullPointerException {
	public static void main(String[] args) {
	try {
		String s = null;
		int a = s.length();
	} catch (Exception e) {
		System.out.println("s chua duoc gan gia tri");
	}
	}
}
