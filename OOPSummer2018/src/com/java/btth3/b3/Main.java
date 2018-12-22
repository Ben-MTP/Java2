package com.java.btth3.b3;

public class Main {

	public static void main(String[] args) {
		//Add du lieu vao ham Main:
		//Khoi tao cac doi tuong: Rectangle, Square, Triangle, Circle:
		Rectangle rec = new Rectangle("Rectangle_1", 10, 100);
		Triangle tri = new Triangle("Triangle_1", 15, 100);
		Circle cir = new Circle("Circle_1", 14, 90);
		Square squ = new Square("Square_1", 12, 60);
		
		//Lam cach nao de add du lieu vao trong 1 listShape:
		Layer layer = new Layer();
		layer.listShape.add(rec);
		layer.listShape.add(tri);
		layer.listShape.add(cir);
		layer.listShape.add(squ);
		layer.listShape.add(rec);
		layer.listShape.add(tri);
		layer.listShape.add(cir);
		layer.listShape.add(squ);
		
		//In listShape:
		for(int i = 0; i < layer.listShape.size(); i++) {
			String temp = layer.listShape.get(i).toStringKichThuocViTri();
			System.out.println(temp);
		}
		
		//Xoa nhung doi tuong thuoc lop Triangle trong listShape:
		layer.deleteShape();
		System.out.println("\n------Show list after delete Triangle: ------");
		layer.showShape();
		
		//Khoi tao 1 lop Layer moi:
		Diagram diagram = new Diagram();
		
		Layer layer_dia = new Layer();
		
		//Add du lieu vao layer_dia:
		layer_dia.listShape.add(squ);
		layer_dia.listShape.add(cir);
		layer_dia.listShape.add(tri);
		layer_dia.listShape.add(rec);
		layer_dia.listShape.add(squ);
		layer_dia.listShape.add(cir);
		layer_dia.listShape.add(tri);
		layer_dia.listShape.add(rec);
		
		/*Xoa nhung doi tuong thuoc lop Circle trong Diagram:
		 * Xay dung duoc cac thuc xoa trong lop Diagram:
		*/
		diagram.listLayer.add(layer);
		diagram.listLayer.add(layer_dia);
		
		diagram.deleteLayer();
		System.out.println("\n------Show list after delete Circle to Diagram: ------");
		diagram.showLayer();
	}

}
