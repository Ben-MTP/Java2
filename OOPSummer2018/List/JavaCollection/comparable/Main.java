package JavaCollection.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Tao mot list: nguoi:
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "A Manh"));
		list.add(new Person(3, "A Minh"));
		list.add(new Person(9, "A Hung"));
		list.add(new Person(4, "A Hai"));
		list.add(new Person(11, "A Duc"));
		System.out.println("Truoc khi xep: ");
		for(Person p : list) {
			System.out.println(p.in());
		}
		
		//Sau khi sap xep:
		System.out.println("Sau khi xep: ");
		Collections.sort(list);
		for(Person p : list) {
			System.out.println(p.in());
		}

	}
}
