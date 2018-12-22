package BTthuchanh.danhsachnhanvien;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Khoi tao mot danh sach nhan vien:
		//fix cung du lieu la: 4 nhan vien
		@SuppressWarnings("unused")
		final int size = 4;
		Employee [] listEm = new Employee[4];
		
		/* Truyen gia tri cho tung nhan vien:
		 * Ten, tuoi, dia chi(TP, duong, so nha)
		 * Ve cong viec: maNhanVien, luong, chucVu
		 * */
		/*fix cung du lieu:
		listEm[0].setMaNhanVien("uet12345");
		listEm[0].setLuong(12000000);
		listEm[0].setChucVu("Giam Doc");
		listEm[0].setName("Minh Manh");
		listEm[0].setAge(23);
		//Xu ly ve bien Address:
		Address add1 = new Address();
		add1.setTenThanhPho("TP.Thai Binh");
		add1.setTenDuong("Dong Xuan");
		add1.setSoNha("DX12");
		listEm[0].setAddress(add1);
		//----------------------------------
		
		listEm[1].setMaNhanVien("uet12346");
		listEm[1].setLuong(12000012);
		listEm[1].setChucVu("Truong Phong Nhan Su");
		listEm[1].setName("Ngoc Minh");
		listEm[1].setAge(22);
		
		Address add2 = new Address();
		add2.setTenThanhPho("TP.Thai Binh");
		add2.setTenDuong("Hung Ha");
		add2.setSoNha("HH13");
		listEm[1].setAddress(add2);
		//----------------------------------
		
		listEm[2].setMaNhanVien("uet12347");
		listEm[2].setLuong(12000014);
		listEm[2].setChucVu("Truong Phong Tai Chinh");
		listEm[2].setName("Viet Hung");
		listEm[2].setAge(22);
		
		Address add3 = new Address();
		add3.setTenThanhPho("TP.Vinh Phuc");
		add3.setTenDuong("Yen Lac");
		add3.setSoNha("YL15");
		listEm[2].setAddress(add3);
		//----------------------------------
		
		listEm[3].setMaNhanVien("uet12348");
		listEm[3].setLuong(12000056);
		listEm[3].setChucVu("Truong Phong Thiet Ke");
		listEm[3].setName("Thanh Hai");
		listEm[3].setAge(22);
		
		Address add4 = new Address();
		add4.setTenThanhPho("TP.Vinh");
		add4.setTenDuong("Vinh");
		add4.setSoNha("Y19");
		listEm[3].setAddress(add4);
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println(listEm.length);
		for(int i = 0; i < listEm.length; i++) {
			//Nhap gia tri tu ban phim: 
			System.out.println("-------------Thong tin nhan vien: "+i+"-------------");
			System.out.println("Enter: tenNhanVien: ");
			String name = scan.nextLine();
			System.out.println("Enter tuoi: ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter: maNhanVien: ");
			String maNhanVien = scan.nextLine();
			System.out.println("Enter: chucVu: ");
			String chucVu = scan.nextLine();
			System.out.println("Enter: Luong: ");
			int luong = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter: TP: ");
			String tenThanhPho = scan.nextLine();
			System.out.println("Enter tenDuong: ");
			String tenDuong = scan.nextLine();
			System.out.println("Enter: soNha: ");
			String soNha = scan.nextLine();
			
			//Khoi tao doi tuong add nhap vao gia tri tenThanhPho, tenDuong, soNha:
			Address add = new Address(tenThanhPho, tenDuong, soNha);
			//Khoi tao doi tuong per nhap vao gia tri Name, Age, Add:
			//Person per = new Person(name, age, add);
			//Khoi tao doi tuong emp luu thong tin ve maNhanVien, luong, chucVu:
			Employee emp = new Employee(maNhanVien, luong, chucVu, name, age, add);
			//per.setAddress(add);
			
			listEm[i] = emp;
			scan.nextLine();
		}
		
		//In thong tin ve nhan vien:
		for(int i = 0; i < listEm.length; i++) {
			System.out.println("-------------Thong tin nhan vien: "+i+"-------------");
			System.out.println(listEm[i].getName());
			System.out.println(listEm[i].getAge());
			System.out.println(listEm[i].getChucVu());
			System.out.println(listEm[i].getMaNhanVien());
			System.out.println(listEm[i].getLuong());
			System.out.println(listEm[i].getAddress().getTenThanhPho());
			System.out.println(listEm[i].getAddress().getTenDuong());
			System.out.println(listEm[i].getAddress().getSoNha());
			
		}
	}
}
