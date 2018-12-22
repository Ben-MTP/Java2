package BTthuchanh.kethuatrongjava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Bien doi tuong con truy cap duoc nhung thuoc tinh mo cua lop cha:
		NhanVien nhanvien = new NhanVien();
		nhanvien.name = "Minh Manh";
		nhanvien.age = 22;
		nhanvien.address = "Dong Hung - Thai Binh";
		//System.out.println(nhanvien.In());
		//2. Bien doi tuong truy cap duoc phuong thuc mo cua chinh no:
		nhanvien.mucLuong();
		
		//3. Bien doi tuong try cap duoc phuong thuc mo cua lop cha:
		nhanvien.setName("Viet Hung");
		nhanvien.setAge(21);
		nhanvien.setAddress("Vinh Phuc");
		
		//4. In thong tin nhan vien tuong ung:
		//System.out.println(nhanvien.In());
	}

}
