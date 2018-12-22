package com.java.btth3.bt2;
import java.math.*;


public class Circle extends Shape{
	final float PI = 3.14f;
	//Ban kinh:
	private double radius = 1.0;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		super();
		this.setRadius(radius);
	}
	
	public Circle(double radius, String color, boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Tinh dien tich:
	public double getArea() {
		return (radius*radius*PI);
	}
	//Tinh chu vi:
	public double getPerimeter() {
		return (2*radius*PI);
	}
	
	//toString:
	public String toString() {
		return "R: "+radius +", Color: "+ super.getColor() +", Filled: "+ super.isFilled() +", S: "+ getArea() +", P: "+ getPerimeter();
	}
}
