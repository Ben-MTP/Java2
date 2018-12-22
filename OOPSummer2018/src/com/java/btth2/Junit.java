package com.java.btth2;

public class Junit {
	//1. fix cung du lieu:
	static int [] arr = {11, 12, 13, 14, 15};
	
	
	//ham tinh gia tri Max2so, tra ve gia tri max:
	public static int maxHaiSo(int a, int b) {
		if(a>b) return a;
		else return b;
	}
	
	//Tim gia tri min trong mang 1 chieu: 
	public static int minArray() {
		int minArray = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<minArray) {
				minArray = arr[i];
			}
		}
		return minArray;
	}
	
	//Gia tri BMI tra ve tung uong voi tung gia tri
	public static String BMITest(float canNang, float chieuCao) {
		float indexBMI = canNang/(chieuCao*chieuCao);
		if(indexBMI < 18.5) return "Thieu Can";
		else if(indexBMI >=18.5 && indexBMI < 23) return "Binh Thuong";
		else if(indexBMI >=23 && indexBMI < 24.99) return "Thua Can";
		else return "Beo Phi";
	}
}
