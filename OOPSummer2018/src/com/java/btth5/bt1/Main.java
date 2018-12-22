package com.java.btth5.bt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Utils utl = new Utils();
		String path = "D:\\1. HK21718\\LTHDTJava\\OOPSummer2018\\bin\\com\\java\\btth5\\bt1\\data.txt";
		System.out.println(utl.readContentFromFile(path));
		
		utl.writeContentToFile(path);
		
		System.out.println("Dang ghi du lieu vao file: ");
		utl.appendContentToFile(path);
		System.out.println(utl.readContentFromFile(path));
		
		String folder = "bt1";
		String fileName = "data1.txt";
		File ketQua = utl.findFileByName(folder, fileName);
		
		if(ketQua==null){
            System.out.println("Khong ton tai file");
        }else{
            System.out.println(ketQua.getName());
        }
	}
}
