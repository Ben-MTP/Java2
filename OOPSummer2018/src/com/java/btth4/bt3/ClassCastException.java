package com.java.btth4.bt3;

public class ClassCastException {
	public static void main(String[] args) {
		try {
			Object o = String.valueOf(0);
			int i = (int) o;
		} catch (Exception e) {
			System.out.println("Loi say ra khi ep kieu");
		}
	}
}
