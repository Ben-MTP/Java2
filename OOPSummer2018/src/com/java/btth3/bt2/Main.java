package com.java.btth3.bt2;

public class Main {

	public static void main(String[] args) {
		
		//Doi tuong Circle:
		Circle circle = new Circle(15.2, "black", false);
		System.out.println(circle.toString());
		
		//Doi tuong Rectangle:
		Rectangle rectangle = new Rectangle(15.2, 15.2, "red", true);	
		System.out.println(rectangle.toString());
		
		//Doi tuong Square:
		Square square = new Square(15.2, "yellow", false);
		//System.out.println(square.getSide());
		//System.out.println(square.getArea());
		System.out.println(square.toString());;
		
	}

}
