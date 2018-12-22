package com.java.btth3.bt2;

public class Rectangle extends Shape{
	//Chieu rong-width, chieu dai-length:
	private double width = 1.0;
	private double length = 1.0;
	
	//Constructor:
	public Rectangle() {
		
	}
	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		//Khoi super goi lay thuoc tinh trong lop cha:
		this.setWidth(width);
		this.setLength(length);
		super.setColor(color);
		super.setFilled(filled);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2*(length + width);
	}
	
	public String toString() {
		return "W: "+width +", "+"L: "+length+ ", "+"Color: "+super.getColor() +", "+"Filled: "+ super.isFilled() +", "+ "S: "+getArea() +", "+"D: "+ getPerimeter();
	}
}
