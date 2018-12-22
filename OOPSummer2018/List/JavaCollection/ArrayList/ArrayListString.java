package JavaCollection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListString {
	//Khoi tao listString:
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		list.add("t");
		list.add("b");
		list.add("q");
		list.add("p");
		list.add("w");
		In();
		//Sap xep chung theo thu tu tang:
		Collections.sort(list);
		System.out.println("Sau khi sap xep: ");
		In();
	}
	public static void In() {
	//In mang ra ngoai:
		for(String s: list) {
		System.out.println(s);
	}
	}
}
