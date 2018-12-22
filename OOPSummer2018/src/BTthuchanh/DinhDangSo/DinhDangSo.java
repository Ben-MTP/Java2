package BTthuchanh.DinhDangSo;

import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {
	public static void main(String[] args) {
		long a = 121212121l;
		double b = 19992.21211;
		
		//Dinh dang theo kieu VN:
		Locale locale = new Locale("vi", "VN");
		NumberFormat format = NumberFormat.getInstance(locale);
		
		System.out.println(format.format(a));
		System.out.println(format.format(b));
	}
}
