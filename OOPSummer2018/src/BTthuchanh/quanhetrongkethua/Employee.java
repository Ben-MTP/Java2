package BTthuchanh.quanhetrongkethua;

//Class Employee thua ke tu lop Person:

public class Employee extends Person{
	//Them mot thuoc tinh cua lop Employee nua:
	private int mucLuong;
	
	public void setMucLuong(int mucLuong) {
		this.mucLuong = mucLuong;
	}
	
	public int getMucLuong() {
		return mucLuong;
	}
}
