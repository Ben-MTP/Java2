package BTthuchanh.quanhetrongkethua;

public class Person {
	private String ten;
	private DiaChi diaChi;
	
	//Truyen vao gia tri ten nguoi:
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	//Truyen vao gia tri dia chi(tenThanhPho, tenDuong) vao bien dia chi
	public void setDiachi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}
	
	public String getTen() {
		return ten;
	}
	
	public DiaChi getDiaChi() {
		return diaChi;
	}
	
	
}
