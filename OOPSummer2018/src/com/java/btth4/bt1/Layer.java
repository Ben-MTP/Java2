package com.java.btth4.bt1;
/* Layer la mot doi tuong thuoc Diagram:
 * */

import java.util.ArrayList;
import java.util.List;

public class Layer {
//	Diagram layer = new Diagram();
	public ArrayList<Shape> listShape = new ArrayList<Shape>();
	/* Them thuoc tinh visible cho Layer:
	 * Khi thuoc tinh nay la false cac hinh thuoc doi tuong Layer 
	 * day se khong duoc ve tren Diagram:
	 */
	private boolean visible = true;
	
	//Xoa:
	public void DeleteTriangle() {
		for(int i = 0; i < listShape.size(); i++) {
			if(listShape.get(i) instanceof Triangle) {
				listShape.remove(i);
			}
		}
	}

	public boolean getVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public void kiemTra() {
		if(visible == false) {
			//Khong ve hinh
		}
	}
	
	//Phuong thuc xoa hinh trung nhau:
	public void removeShape() {
        for (int i = 0; i < listShape.size() - 1; i++) {
            for (int j = i+1; j < listShape.size(); j++) {
                if (listShape.get(i).equals(listShape.get(j))) {
                	listShape.remove(j);
                }
            }
        }
    }
}
