package com.java.btth5.bt1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
	public Utils() {
		
	}
	//Doc du lieu tu file:
	public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
        
		//Bien dung de noi ki tu tu file doc doc:
		String s =" ";
        FileInputStream inputStream = new FileInputStream(new File(path));
        int i = 0;
            while ((i = inputStream.read()) != -1) {
                s+=(char)i;
            }
        return s;    
    }
	
	//Ghi du lieu vao file:
	public static void writeContentToFile(String path) throws FileNotFoundException, IOException{
		String s = "123abc";
		
		File file= new File(path);
        FileOutputStream outputStream = new FileOutputStream(file);
        
        if (file.exists()) {
            file.delete();
        }
        //Doc du lieu vao o cung duoi dang byte:
        byte b[] = s.getBytes();
        outputStream.write(b);
        outputStream.close();
	}
	
	//Tim file theo ten:
	public static File findFileByName(String folder, String fileName){
		//Xu ly chuoi duoc dua vao duoi dang: ...//...
        String filePath= folder +"\\"+fileName;
        File file=new File(filePath);
        
        if(!file.exists()){
            return null;
        }
        return file;
    }
	
	//Chen du lieu vao file da co du lieu:
	public static void appendContentToFile(String path) throws FileNotFoundException, IOException{
        String data = "abc123";
        File file = new File(path);
        
        //Xu ly neu chua tao ra file:
        if (!file.exists()) {
           file.createNewFile();
        }else{
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } 
    }
}
