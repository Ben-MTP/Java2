package com.java.btth4.bt3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class IOException {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("D:/data.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ObjectInputStream o = new ObjectInputStream(f);
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
