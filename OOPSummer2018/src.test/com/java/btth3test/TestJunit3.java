package com.java.btth3test;

import org.junit.Test;

import com.java.btth3.bt3.Circle;
import com.java.btth3.bt3.Diagram;
import com.java.btth3.bt3.Layer;
import com.java.btth3.bt3.Shape;
import com.java.btth3.bt3.Square;
import com.java.btth3.bt3.Triangle;

public class TestJunit3 {
	//Sua lai theo tung testcase
	@Test
	public void testDeleteLayer() {
		Diagram dia = new Diagram();
		
		Layer lay1 = new Layer();
		Layer lay2 = new Layer();
		
		Shape sha1 = new Triangle(12, 10);
		Shape sha2 = new Circle(14, 20);
		Shape sha3 = new Square(14, 30);
		
		lay1.listShape.add(sha1);
		lay1.listShape.add(sha2);
		lay1.listShape.add(sha3);
		
		Shape sha11 = new Triangle();
		Shape sha22 = new Circle();
		Shape sha33 = new Square();
		
		lay2.listShape.add(sha11);
		lay2.listShape.add(sha22);
		lay2.listShape.add(sha33);
		
		dia.listLayer.add(lay1);
		dia.listLayer.add(lay2);
		
		//GOi ham xoa:
		dia.DeleteLayer();
	}
	
	@Test
	public void testDeleteTriangle() {
		Layer lay1 = new Layer();
		
		Shape sha1 = new Triangle();
		Shape sha2 = new Circle();
		Shape sha3 = new Square();
		
		lay1.listShape.add(sha1);
		lay1.listShape.add(sha2);
		lay1.listShape.add(sha3);
		
		lay1.DeleteTriangle();
	}
}
