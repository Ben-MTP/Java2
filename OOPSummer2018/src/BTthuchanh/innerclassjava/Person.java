package BTthuchanh.innerclassjava;
/* Inner class: class trong mot class khac:
 * bien static: dung de dat tinh trong do:
 * */
public class Person {
	private String name;
	//hobby: so thich
	private String hobby;
	//1. Constructor: ko tham so:
	public Person() {
		
	}
	//2. Constructor: co tham so khong kieu gia tri tra ve:
	public Person(String name, String hobby) {
		this.name = name;
		this.hobby = hobby;
	}
	
	static class Kid{
		int age;
		//Constructor: khong tham so:
		public Kid() {
			
		}
		//Constructor: co tham so:
		public Kid(int age) {
			this.age = age;
		}
		void Said() {
			System.out.println("Em chua 18+ vi em: "+age+" tuoi");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String In() {
		return "Ten: "+name+" So thich: "+hobby;
	}
}
