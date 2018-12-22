package JavaCollection.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		//show full value:
		for(String s : list) {
			System.out.print(s+", ");
		}
		System.out.println();
		//Xoa phan tu mang gia tri A:

		//show theo kieu Iterator:
		Iterator<String> str = list.iterator();
		/* Kiem tra xem co phan tu trong str hay khong:
		 * Neu co true, khong false:
		 * */
		while(str.hasNext()) {
			//Doc phan tu do ra: 
			String s;
			s = str.next();
			if(s.equals("A")) {
				str.remove();
				}
//			System.out.print(s+", ");
		}
		
		for(String s : list) {
			System.out.print(s+", ");
		}
		
	}
}
