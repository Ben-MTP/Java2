package JavaCollection.LinkedList;

public class Person {
	private String name;
	private int age;
	
	//1. Phuong thuc khoi tao:
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//2. Phuong thuc set/get
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age > 0) {
			this.name = name;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPerson() {
		return name+" "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person)?(((Person) obj).getAge() == this.age): false;
	}
}
