package com.java.btth5.XuLyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveToFile {
	public static void main(String[] args) {
		//Khoi tao 3 doi tuong: zombie, peaShooter, mushroom:
		GameCharacter zombie = new GameCharacter(50, "Zombie");
		zombie.addWeapon(new Weapon("Aka47"));
		zombie.addWeapon(new Weapon("Rocker400"));
		
		GameCharacter peaShooter = new GameCharacter(40, "PeaShooter");
		peaShooter.addWeapon(new Weapon("SungCoi"));
		
		GameCharacter mushroom = new GameCharacter(30, "MagicMushroom");
		mushroom.addWeapon(new Weapon("Poison"));
		mushroom.addWeapon(new Weapon("Light"));
		
		//Xuat ra file ngoai he thong --> game.dat
		try {
			FileOutputStream fileStream = new FileOutputStream("game.dat");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			os.writeObject(zombie);
			os.writeObject(peaShooter);
			os.writeObject(mushroom);
			
			os.close();
			fileStream.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//Lay file tu ngoai he thong dua vao:
		try {
			FileInputStream fileStream = new FileInputStream("game.dat");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			
			GameCharacter o1 = (GameCharacter) os.readObject();
			GameCharacter o2 = (GameCharacter) os.readObject();
			GameCharacter o3 = (GameCharacter) os.readObject();
			os.close();
			fileStream.close();
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
