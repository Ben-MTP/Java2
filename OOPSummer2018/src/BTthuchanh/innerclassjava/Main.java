package BTthuchanh.innerclassjava;

public class Main {
	public static void main(String[] args) {
		//Khoi doi tuong person1 khoi tao khong tham so:
		Person person1 = new Person();
		person1.setName("Minh Manh");
		person1.setHobby("Hoc Tieng Anh");
		System.out.println(person1.In());
		
		Person person2 = new Person("Viet Hung", "Hoc Toan");
		System.out.println(person2.In());
		
		person2.setName("Ngoc Minh");
		System.out.println(person2.In());
		
		Person.Kid kid = new Person.Kid(16);
		kid.Said();
	}
}
