package JavaCollection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("A", 12);
		Person p2 = new Person("B", 12);
		Person p3 = new Person("C", 12);
		Person p4 = new Person("D", 12);
		//Khai bao mot ArrayList --> hay con goi la List person:
		List<Person> listperson = new ArrayList<Person>();
		listperson.add(p1);
		listperson.add(p2);
		listperson.add(p3);
		listperson.add(p4);
		listperson.add(p2);
		
		//In danh sach:
		for(int i = 0; i < listperson.size(); i++) {
			Person person = new Person();
			person = listperson.get(i);
			
			//System.out.println(person.getPerson());
			System.out.print(listperson.get(i).getPerson()+", ");
		}
		System.out.println("\n");
		
		//Remove phan tu:
		listperson.remove(2);
		//In danh sach:
		for(int i = 0; i < listperson.size(); i++) {
			Person person = new Person();
			person = listperson.get(i);
			//System.out.println(person.getPerson());
			System.out.print(listperson.get(i).getPerson()+", ");
		}

	}
}
