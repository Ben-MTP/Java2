package com.java.btth5.bt3;

import java.util.Random;

public class BubbleSort {
	static int[] arr = new int[1000];
	public static void main(String[] args) {
		Random ran=new Random();
		int i,index;
        for(i=0;i<1000;i++){
            index=ran.nextInt(10000);
            arr[i]=index;
        }
        
        System.out.println("1000 phan tu khi chua sap xep: ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("1000 phan tu duoc sap xep nhu sau: ");
        SapXep();
        
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
	
	public static void SapXep() {
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length - i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
