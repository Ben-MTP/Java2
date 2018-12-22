package BTthuchanh.quanhetrongkethua;

public class DiaChi {
	private String tenThanhPho;
	private String tenDuong;
	
	//1. Chinh sua gia tri ten Thanh Pho:
	public void setTenThanhPho(String tenThanhPho) {
		this.tenThanhPho = tenThanhPho;
	}
	
	//1. Chinh sua gia tri ten duong:
	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}
	
	
	//2. Tra ve gia tri cho cac ham:
	public String getTenThanhPho() {
		return tenThanhPho;
	}
	
	public String getTenDuong() {
		return tenDuong;
	}
}
