package BTthuchanh.ChuoiHoaDoiTuongRaVaoFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDriverIO {
	public static void main(String [] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("game.dat");
		FileInputStream fileInStream = new FileInputStream("game.dat");
		ObjectOutputStream os = new ObjectOutputStream(fileStream);
		ObjectInputStream osIn = new ObjectInputStream(fileInStream);
		Object zombie = new Object();
		Object peaShooter = new Object();
		Object mushroom = new Object();
//		System.out.println("Begin write Data into file");
		os.writeObject(zombie);
		os.writeObject(peaShooter);
		os.writeObject(mushroom);
		
		osIn.readObject();
		os.close();
		
		fileStream.close();
//		System.out.println("The End");
	}
}
