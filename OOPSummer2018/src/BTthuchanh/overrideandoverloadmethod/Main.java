package BTthuchanh.overrideandoverloadmethod;

public class Main {

	public static void main(String[] args) {
		SuperClass superclass = new SuperClass();
		
		//Overloading:
		System.out.println("Phuong thuc trong SuperClass: ");
		System.out.println(superclass.tongHaiSo());
		System.out.println(superclass.tongHaiSo(100));
		System.out.println(superclass.tongHaiSo(100, 200));
		System.out.println(superclass.tongHaiSo((float)10.2, (float)13.2));
		System.out.println(superclass.tongHaiSo((float)12.2));
		
		//Goi phuong thuc lop con:
		System.out.println("Phuong thuc trong SupClass: ");
		SupClass supclass = new SupClass();
		System.out.println(supclass.tongHaiSo(100));
		System.out.println(supclass.tongHaiSo((float)10.2, (float)13.2));
		
		/*Lop con da co roi. goi lai lop cha:
		 * Goi lam cua thang cha trong thang con:
		 * Khac hoan toan goi lam cua thang cha trong main:
		*/

	}

}
