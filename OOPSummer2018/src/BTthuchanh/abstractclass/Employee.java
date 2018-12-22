package BTthuchanh.abstractclass;
/* Class Employee ke thua tu lop Person
 * Thi 2 truong hop:
 * 1. class do phai la Abstract
 * 2. Dinh nghia la toan bo phuong thuc trong Abstract class do:
 * */
public class Employee extends Person {
	private int luong;
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public int getLuong() {
		return luong;
	}
	
	@Override
	public void go() {
		System.out.println("Chay Ngay Di - SonTungMTP");
		}

	@Override
	public String keu() {
		// TODO Auto-generated method stub
		return "Sky oi, say oh yeah";
	}

}
