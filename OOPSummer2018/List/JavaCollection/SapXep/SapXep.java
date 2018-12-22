package JavaCollection.SapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXep {
	public static void main(String[] args) {
		//Tao mot ArrayList:
		List<String> list = new ArrayList<String>();
		
		//Add phan tu vao mang:
		list.add("Manh");
		list.add("Minh");
		list.add("Hung");
		list.add("Hai");
		list.add("Hoc");
		list.add("Duc");
		list.add("Huong");
		list.add("Duy");
		//In danh sach co trong ArrayList:
		System.out.println(list.size());
		System.out.println(list);
		
		//Xep mang theo tang dan trong bang chu cai:
		System.out.println("Mang sau khi sap xep: ");
		Collections.sort(list);
		System.out.println(list);
	}
}
