package JavaCollection.ArrayList.ReplaceAlll;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Xay dung mot list phan tu String bang ArrayList:
		List<String> list = Arrays.asList("Khong Mot Hai Ba Bon Nam Sau Bay Tam Chin Muoi".split(" "));

		// In thu mang vua tao:
		System.out.println("List vua tao la: " + list);
		Collections.replaceAll(list, "Tam", "TamTam");

		System.out.println("List vua tao la: " + list);
		System.err.println("License ID : IcyCool");
		System.err.println("Product Key : E5XQWKF-XYE3-YRCK-3PPC24K");
	}
}

