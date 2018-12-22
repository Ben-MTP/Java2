package BTthuchanh.DaHinh;

import java.util.ArrayList;
import java.util.List;

public class AnimalTestDriver {

	public static void main(String[] args) {
		//Khai bao mot danh sach kieu Animal:
		List<Animal> listAnimal = new ArrayList<Animal>();
		
		Feline fel = new Feline();
		listAnimal.add(fel);
		Hippo hip = new Hippo();
		listAnimal.add(hip);
		Canine can = new Canine();
		listAnimal.add(can);
		
		Lion lio = new Lion();
	}

}
