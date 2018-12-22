package com.java.btth5.Serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		//Khai bao moi doi tuong Employee:
		Employee e1 = new Employee("Khong Minh Manh", "Dong Xuan - Dong Hung - Thai Binh", 110001, 1996);
		Employee e2 = new Employee("Do Viet Hung", "Vinh Phuc", 110002, 1997);
		
		//Tung ra Exception:
		try {
			//Thu tuc xu ly file nhu binh thuong:
			FileOutputStream fileOut = new FileOutputStream("D:\\1. HK21718\\LTHDTJava\\OOPSummer2018\\DataSer.txt");
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			
			objOut.writeObject(e1);
			objOut.writeObject(e2);
			
			objOut.close();
			fileOut.close();
			System.out.printf("Serialized data is saved!");
		}catch(IOException i) {
			i.printStackTrace();
		}
	}
}

