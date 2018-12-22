package JavaCollection.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		
		//In phan tu ra ngoai:
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s+", ");
		}
		
	}
}
