package com.java.btth4.bt3;
/*
 * Loi ArrayIndexOfBoundException say ra khi truy cap vao index khong ton tai trong mang
 */
public class ArrayIndexOfBoundException {
	public static void main(String[] args) {
		try {
			int[] arr = new int[10];
			int temp = arr[11];
		} catch (Exception e) {
			System.out.println("Sai dia chi index trong mang arr");
		}
	}
}
