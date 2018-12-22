package com.java.btth3.b3;
/* Xay dung mot lop dai dien cho so do dang ve:
 * */

import java.util.ArrayList;
import java.util.List;

public class Diagram {
	//Constructo:
	public Diagram() {
		
	}
	List<Layer> listLayer = new ArrayList<Layer>();
	/*Xoa doi tuong Circle du class Diagram:
	 * Diagram chua Layer
	 * Layer chua Shape
	 * Ma Shape la lop cha cua Circle nen hoan toan co the xoa duoc no tu lop Diagram:
	 * */
	public void deleteLayer() {
		/*Truy cap tang 1 cua lop --> lay ra danh sach nhung Layer
		 * Vi mot Diagram chua nhieu Layer:
		 * */
		for(int i = 0; i < listLayer.size(); i++) {
//			System.out.println("ListLayer 1: ");
			for(int j = 0; j < listLayer.size(); j++) {
				/* Truy xuat vao tung Layer mot
				 * Moi Layer chua nhieu Shape
				 * Shape la cha cua nhung lop co ban:
				 * Xoa tu nhung lop co ban:
				 * */
				if(listLayer.get(i).listShape.get(j) instanceof Circle) {
					listLayer.get(i).listShape.remove(j);
				}
			}
		}
	}
	
	//Show listLayer:
	public void showLayer() {
		for(int i = 0; i < listLayer.size(); i++) {
			for(int j = 0; j < listLayer.size(); j++) {
				String temp = listLayer.get(j).listShape.get(j).toStringKichThuocViTri();
				System.out.println(temp);
			}
		}
	}
}
