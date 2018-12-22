package BTthuchanh.docghifiletxt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DocGhiFile {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		//Doc du lieu tu file:
		//Tao file txt ghi du lieu:s
		File file = new File("data.txt");
		
		//Xu ly nao file chua duoc tao thi tao file moi:
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//Truyen du lieu vao file:
		FileInputStream fileInPutStream = new FileInputStream(file);
		int c = fileInPutStream.read();
		while (c != -1) {
			System.out.print((char)c);
			c = fileInPutStream.read();
		}
		
		fileInPutStream.close();
		
		//Ghi du lieu vao file:
		FileOutputStream fileOutPutStream = new FileOutputStream(file);
		//Du lieu can ghi vao file thong qua mot String:
		String s = "Khong Minh Manh";
		System.out.println("\nEnter data: ");
		s = scan.nextLine();
		fileOutPutStream.write(s.getBytes());
		
		fileOutPutStream.close();
		System.out.println("Write data Succeed!");
	}
}
