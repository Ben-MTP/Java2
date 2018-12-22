package com.java.btth4.bt3;

import java.io.FileInputStream;

public class FileNotFoundException {
	public static void main(String[] args) {
		try {
			try {
				FileInputStream f = new FileInputStream("D:/data.txt");
			} catch (java.io.FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Khong tim thay file: data.txt");
		}
	}
}
