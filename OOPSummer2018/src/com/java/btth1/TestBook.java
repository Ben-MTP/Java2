package com.java.btth1;

import java.util.Scanner;

public class TestBook {
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size = -1;
		
		System.out.println("Enter size: ");
		size = input.nextInt();
		input.nextLine();
		
		//Tao 1 mang kieu book luu danh sach:
		Book [] book = new Book[size];
		
		//Tao danh sach book trong thu vien:
		for(int i = 0; i<size; i++) {
			System.out.println("Enter Tensach & soluong: ");
			String tensach = input.nextLine();
			int sl = input.nextInt();
			
			book[i] = new Book(tensach, sl);
			
			input.nextLine();
		}
		
		//In danh sach book:
		for(int i = 0; i<size; i++) {
			System.out.println(book[i].In());
		}
		
		//Muon sach:
		int sldamuon = -1;
		for(int i = 0; i<size; i++) {
			System.out.println("So luong muon cua: " + book[i].getTensach());
			sldamuon = input.nextInt();
			book[i].setSldamuon(sldamuon);
		}
		
		//In danh sach sach hien co:
		for(int i = 0; i<size; i++) {
			System.out.println("Ten sach: " + book[i].getTensach() +" sl con lai: "+ book[i].Soluongconlai());
		}
		
	}
}
