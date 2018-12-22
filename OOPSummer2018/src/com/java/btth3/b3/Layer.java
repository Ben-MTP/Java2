package com.java.btth3.b3;
/* Xay dung doi lop Layer mot doi tuong Diagram co nhieu doi tuong thuoc Layer
 * 
 * */

import java.util.ArrayList;
import java.util.List;

public class Layer {
	//Contructor khoi tao doi tuong:
	public Layer() {
		
	}
	
	//Create listShape save Object Shape:
	List<Shape> listShape = new ArrayList<Shape>();
	//Xay dung mot listShape chua nhung doi tuong Shape thanh mot List:
	
	//Add du lieu vao lop listShape: --> dung cho ham main:
	
	/*Phuong thuc xoa doi tuong thuoc lop Triangle trong lop do:
	 *Do Shape la lop cha cua Triangle nen hoan toan co the xoa no di trong class Layer:
	 * Truy xuat theo mot tang:
	 **/
	//Truy xuat vao du gia tri trong listShape:
	public void deleteShape() {
		for(int i = 0; i < listShape.size(); i++) {
			if(listShape.get(i) instanceof Triangle) {
				listShape.remove(i);
			} else {
				//Khong co gi!
			}
		}
	}
	
	//In listShape:
	public void showShape() {
		for(int i = 0; i < listShape.size(); i++) {
			String temp = listShape.get(i).toStringKichThuocViTri();
			System.out.println(temp);
		}
	}
}
