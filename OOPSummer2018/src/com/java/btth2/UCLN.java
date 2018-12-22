package com.java.btth2;

import java.util.Scanner;

public class UCLN {
	
	public static void main(String[] args) {
		int a, b;
		int flag;
		do {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number 1: ");
			a = scan.nextInt(); scan.nextLine();
			System.out.println("Enter number 2: ");
			b = scan.nextInt(); scan.nextLine();
			
			//Uoc chung 2 so: 
			int uocChung = UCLN(a, b);
			System.out.println("Uoc chung 2 so("+a+" "+b+") la: "+uocChung);
			
			//tiep tuc truong trinh khong:
			System.out.println("Return(1/0): ");
			flag = scan.nextInt();
		}while(flag == 1);
	}
	
	//Ham tinh uoc chung 2 so a, b:
	public static int UCLN(int a, int b) {
		while(a != b)
			if(a > b) a = a -b;
			else b = b -a;
		
		return a;
	}
}
