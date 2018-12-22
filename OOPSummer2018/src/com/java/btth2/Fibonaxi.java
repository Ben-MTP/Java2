package com.java.btth2;

import java.util.Scanner;

public class Fibonaxi {
	public static void main(String[] args) {
		//Gia tri so nguyen n tinh F(n):
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		n = scan.nextInt(); scan.nextLine();
		System.out.println("Print F(N):");
		
		//In luon phan tu F(n):
		for(int i = 0; i<=n; i++) {
			System.out.print("F("+i+")= "+ FibonaxiN(i)+", ");
		}
		System.out.println("\n"+FibonaxiN(n));
	}
	
	/* Ham tinh FibonaxiN:
	 * Dung ham de quy
	 */
	public static int FibonaxiN(int n) {
		if (n==0) return 0;
		else if(n==1) return 1;
		else return FibonaxiN(n-2) + FibonaxiN(n-1);
	}
}
