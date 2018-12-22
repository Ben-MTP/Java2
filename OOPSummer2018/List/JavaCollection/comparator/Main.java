package JavaCollection.comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		List<Person> listPerson = new ArrayList<Person>();
		
		//Add du lieu vao list:
		list.add(new Person(10, "Trang"));
		list.add(new Person(11, "Manh"));
		list.add(new Person(12, "Huong"));
		list.add(new Person(13, "Canh"));
		list.add(new Person(14, "Cuong"));
		
		System.out.println("Truoc khi sap xep: ");
		for(Person p : list) {
			System.out.println(p.in());
		}
	}
	
	//Dung comparator voi List:
	
}
