package com.java.btth2;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("Keu gi ke no!");
	}
	
	public void eat() {
		System.out.println("An gi ke no!");
	}
}
