package BTthuchanh.interfacephuongthuc;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age, luong;
		System.out.println("Enter Name: "); name = scan.nextLine();
		System.out.println("Enter Age: "); age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Luong: "); luong = scan.nextInt();
		scan.nextLine();
		//Dung tinh chat da hinh:
		//Person per = new Employee;
		Employee em = new Employee(name, age, luong);
		System.out.println(em.getEmployee());
		Person person = new Employee();
	}
}
