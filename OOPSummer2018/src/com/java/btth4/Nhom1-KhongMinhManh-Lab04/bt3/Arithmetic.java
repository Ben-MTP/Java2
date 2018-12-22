package com.java.btth4.bt3;

public class Arithmetic {
	public static void main(String[] args) {
		try {
			int a = 100/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Khong the chia cho so 0");
		}
}
}
