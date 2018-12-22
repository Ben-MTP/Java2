package com.java.btth5.Serial;

import java.io.Serializable;

public class Employee implements Serializable{
	String name, address;
	//Thuoc tinh nao khong tuan tu thi nen de la: transient
	//SSN---tuong tu nhu so chung minh thu nhan dan:
	transient int SSN;
	int number;
	
	//Constructor:
	public Employee() {}
	public Employee(String name, String address, int SNN, int number) {
		this.name = name;
		this.address = address;
		this.SSN = SSN;
		this.number = number;
	}
	public void mailCheck() {
		System.out.println("Mailing check to: " + name +"/ "+ address);
	}
}
