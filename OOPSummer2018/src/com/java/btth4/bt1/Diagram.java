package com.java.btth4.bt1;

import java.util.ArrayList;

/*Dai dien cho hinh dang duoc ve:
 * */
public class Diagram {
	public ArrayList<Layer> listLayer = new ArrayList<Layer>();
	//Khong tao Layer trong Diagram:
	public void kiemTra() {
		for(int i = 0; i < listLayer.size(); i++) {
			if(listLayer.get(i).getVisible() == false) {
				//Khong cho doi tuong do chay them nua:
				continue;
			}
		}
	}
	//Xoa:
	public void DeleteLayer() {
		for(int i = 0; i < listLayer.size(); i++) {
			for(int j = 0; j < listLayer.get(i).listShape.size(); j++) {
				if(listLayer.get(i).listShape.get(j) instanceof Circle) {
					listLayer.get(i).listShape.remove(j);
				}
			}
		}
	}
}



