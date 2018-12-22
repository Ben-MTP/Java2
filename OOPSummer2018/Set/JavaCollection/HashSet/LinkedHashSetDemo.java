package JavaCollection.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Person> listPerson = new LinkedHashSet<Person>();
		listPerson.add(new Person(1));
		listPerson.add(new Person(2));
		listPerson.add(new Person(3));
		listPerson.add(new Person(4));
		listPerson.add(new Person(1));
		
		
		//Show full value:
		for(Person p : listPerson) {
			System.out.print(p.getId()+", ");
		}
		System.out.println("\nSau khi xoa: ");
		
		//Xoa phan tu trong listPerson:
		listPerson.remove(new Person(1));
		//Show full value:
		for(Person p : listPerson) {
		System.out.print(p.getId()+", ");
		}
	}
}
