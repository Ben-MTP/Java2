package com.java.btth5.XuLyIO;
import java.io.*;
public class FileOutput {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileStream = new FileOutputStream("game.txt");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		
		//Write Object into os:
		os.writeObject(null);
	}
}
