package com.java.btth3.bt2;

public class Square extends Rectangle{
	private double side;
	//Constructo:
	public Square() {
		super();
	}
	public Square(double side) {
		super();
		super.setWidth(side);
	}
	
	public Square(double side, String color, boolean filled) {
		super();
		this.side = side;
		super.setLength(side);
		super.setWidth(side);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	//phuong thuc set, get cho side:
	public void setSide(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
	}
	@Override
	public double getWidth() {
		return side;
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	@Override
	public double getLength() {
		return getSide();
	}
	
	@Override
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}
	
	public String toString() {
		return "S: "+getArea()+", D: "+getPerimeter();
	}
}
