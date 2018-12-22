package com.java.btth3.bt2;

public class Shape {
	private String color = "red";
	//Khong gian chu day:
	private boolean filled = true;
	
	//1. Constructor khong tham so:
	public Shape() {
		
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	//getColor:
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//filled:
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//toString:
	public String toString() {
		return color+", "+filled;
	}
}
