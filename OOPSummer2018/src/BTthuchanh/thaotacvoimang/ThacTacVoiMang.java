package BTthuchanh.thaotacvoimang;

import java.util.Scanner;

public class ThacTacVoiMang {
	static Scanner scan = new Scanner(System.in);
	static int size = scan.nextInt();
	static Integer [] arr = new Integer[size];

	
	public static void nhapMang() {
		for(int i = 0; i<arr.length; i++) {
		arr[i] = scan.nextInt();
		}
	}
	
	public static void inMang() {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void sepMangTangDan() {
		for(int i = 0; i<arr.length; i++) {
			int temp = arr[i];
			for(int j = i + 1; j<arr.length -1; j++) {
				if(temp>arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[i];
				}
			}
		}
	}
	
	public static void sepMangGiamDan() {
		for(int i = 0; i<arr.length; i++) {
			int temp = arr[i];
			for(int j = i + 1; j<arr.length -1; j++) {
				if(temp<arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[i];
				}
			}
		}
	}

}
