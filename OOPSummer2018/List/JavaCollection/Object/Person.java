package JavaCollection.Object;

public class Person {
	private String name;
	private int age;
	
	//Ham khoi tao:
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object args0) {
		// TODO Auto-generated method stub
		return super.equals(args0);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
