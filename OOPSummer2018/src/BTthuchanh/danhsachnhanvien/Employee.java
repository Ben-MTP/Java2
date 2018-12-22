package BTthuchanh.danhsachnhanvien;
/* Class Employee luu thong tin co ban ve nhan vien
 * chua Address
 * Employee ke thuc Person:
 * Khi minh xac dinh Class nguoi vs nguoi co the co nhung thuoc tinh gan giong nhau de ke thua
 * Con Address duoc luu nhu mot bien de luu thong tin ve dia chi
 * */
public class Employee extends Person{
	private String maNhanVien;
	private int luong;
	private String chucVu;
	
	//1. Ham khoi tao:
	public Employee() {
		
	}
	
	//2. Khoi tao day du tham so:
	public Employee(String maNhanVien, int luong, String chucVu, String name, int age, Address address) {
		super(name, age, address);
		this.maNhanVien = maNhanVien;
		this.luong      = luong;
		this.chucVu      = chucVu;
	}
	
	//3. Ham se/get cho nhung thuoc tinh:
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public String getMaNhanVien() {
		return maNhanVien;
	}
	
	public int getLuong() {
		return luong;
	}
	
	public String getChucVu() {
		return chucVu;
	}
	
}
