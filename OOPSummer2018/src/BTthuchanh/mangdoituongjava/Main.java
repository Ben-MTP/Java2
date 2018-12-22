package BTthuchanh.mangdoituongjava;

import java.util.Scanner;

public class Main {
	final static int CONST = 100;
	public static void main(String [] args) {
		//Khai bao Scanner
		Scanner scan = new Scanner(System.in);
		//1. Khai bao mot mang thong thuong:
		@SuppressWarnings("unused")
		int [] arr = new int[CONST];
		
		//2. Tuong tu khai bao mang doi tuong:
		int size = 10;
		System.out.println("Enter size: ");
		size = scan.nextInt();
		scan.nextLine();
		NhanVien[] nhanvien = new NhanVien[size]; 
		
		//3. Nhap thong tin nhanvien tuong ung:
		for(int i = 0; i < nhanvien.length; i++) {
			System.out.println("Enter Name: ");
			String name = scan.nextLine();
			
			System.out.println("Enter Age: ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter Address: ");
			String address = scan.nextLine();
			
			scan.nextLine();

			nhanvien[i] = new NhanVien(name, age, address);
		}
		
		//4. In thong tin sinh vien:
		for(int i = 0; i < nhanvien.length; i++) {
			System.out.println(nhanvien[i].getName()+" "+nhanvien[i].getAge()+" "+nhanvien[i].getAddress());
			//System.out.println(nhanvien[i].getAddress());
		}
	}
}
