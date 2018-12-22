package com.java.btth3.bt3;

public class Main {

	public static void main(String[] args) {
		Diagram dia = new Diagram();
		
		Layer lay1 = new Layer();
		Layer lay2 = new Layer();
		
		Shape sha1 = new Triangle();
		Shape sha2 = new Circle();
		Shape sha3 = new Square();
		
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
		System.out.println("Ket thuc");
	}
}
