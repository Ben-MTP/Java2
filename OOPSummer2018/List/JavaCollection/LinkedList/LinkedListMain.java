package JavaCollection.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	public static void main(String[] args) {
		//Khai bao kieu LinkedList kieu Person:
		Person p1 = new Person("Manh", 12);
		Person p2 = new Person("Hung", 13);
		List<Person> listPerson = new LinkedList<Person>();
		listPerson.add(p1);
		listPerson.add(p2);
		
		//In ra man hinh:
		//Cach 1:
		for(Person p : listPerson) {
			System.out.print(p.getPerson());
		}
		System.out.println();
		//Cach 2: 
		for(int i = 0; i < listPerson.size(); i++) {
			System.out.print(listPerson.get(i).getPerson());
		}
		System.out.println();
		
		//Cach 3:
		for(int i = 0; i < listPerson.size(); i++) {
			Person p = new Person();
			p = listPerson.get(i);
			System.out.print(p.getPerson());
		}
		System.out.println();
		
		//Cach 4:
		for(int i = 0; i < listPerson.size(); i++) {
			Person p = listPerson.get(i);
			System.out.print(p.getPerson());
		}
		System.out.println("\n--------------------");
		//Xoa phan tu trong linkedList:
		
		listPerson.remove(1);
		for(int i = 0; i < listPerson.size(); i++) {
			Person p = listPerson.get(i);
			System.out.print(p.getPerson());
		}
	}
}
