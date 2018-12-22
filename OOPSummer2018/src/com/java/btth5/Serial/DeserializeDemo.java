package com.java.btth5.Serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e1 = null;
		try {
			FileInputStream fileIn = FileInputStream("D:\\1. HK21718\\LTHDTJava\\OOPSummer2018\\DataSer.txt");
			ObjectInputStream objIn = ObjectInputStream(fileIn);
			e1 = (Employee)objIn.readObject();
			objIn.close();
			fileIn.close();
		}catch (IOException i) {
			i.printStackTrace();
			return;
		}catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e1.name);
		System.out.println("Address: " + e1.address);
		System.out.println("SSN: " + e1.SSN);
		System.out.println("Number: " + e1.number);
	}
}
	
