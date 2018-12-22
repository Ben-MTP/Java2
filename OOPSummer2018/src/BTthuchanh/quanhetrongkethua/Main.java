package BTthuchanh.quanhetrongkethua;

public class Main {
	public static void main(String[] args) {
		//Phuong thuc main thuc hien khoi tao doi tuong Nhan vien:
		//nhap thong tin ten, dia chi(tenThanhPho, tenDuong), ,mucLuong cua nhan vien do:
		Employee em = new Employee();
		
		//Truyen gia tri muc luong cho nhan vien:
		em.setMucLuong(12000000);
		
		//Truyen gia tri ten cho nhan vien:
		em.setTen("Khong Minh Manh");
		
		//Thuc hien truyen gia tri DiaChi cho nhan vien(tenThanhPho, tenDuong)
		/*Employee ke thuc lop Person --> chua thuc tinh: diaChi:
		 * Class Person co 1 thuoc tinh mang gia tri kieu DiaChi thuoc class ngoai:
		 * 
		 * */
		DiaChi dc = new DiaChi();
		dc.setTenThanhPho("TP.Thai Binh");
		dc.setTenDuong("Pho Dong Xuan");
		
		//2. Buoc truyen bien dia chi vao ham setDiaChi()
		em.setDiachi(dc);
		//em.setDiachi(dc).setTenThanhPho("TP.Thai Binh");
		//em.setDiachi(dc).setTenDuong("Pho Dong Xuan"); 
		//System.out.println(em.getTen()+" Muc Luong: "+em.getMucLuong()+" Dia chi: "+em.getDiaChi().getTenDuong()+", "+em.getDiaChi().getTenThanhPho());
		//In thong tin:
		System.out.println("Ten: "+em.getTen());
		System.out.println("Muc luong: "+em.getMucLuong());
		System.out.println("Dia chi: "+em.getDiaChi().getTenDuong()+", "+em.getDiaChi().getTenThanhPho());
	}
}
