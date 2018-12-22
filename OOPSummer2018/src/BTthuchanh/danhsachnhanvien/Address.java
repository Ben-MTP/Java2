package BTthuchanh.danhsachnhanvien;

/*Class Address: luu thong tin ve tenThanhPho, tenDuong, soNha;
 * cac thuoc tinh de private:
 * 
 * */
public class Address {
	private String tenThanhPho;
	private String tenDuong;
	private String soNha;
	
	//1. Ham khoi tao mac dinh:
	public Address() {
		
	}
	
	//2. Ham khoi tao 3 tham so:
	public Address(String tenThanhPho, String tenDuong, String soNha) {
		this.tenThanhPho = tenThanhPho;
		this.tenDuong    = tenDuong;
		this.soNha		 = soNha;
	}
	
	//3. Ham set/get cho nhung thuoc tinh:
	public void setTenThanhPho(String tenThanhPho) {
		this.tenThanhPho = tenThanhPho;
	}
	
	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}
	
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	
	public String getTenThanhPho() {
		return tenThanhPho;
	}
	
	public String getTenDuong() {
		return tenDuong;
	}
	
	public String getSoNha() {
		return soNha;
	}
	
}
