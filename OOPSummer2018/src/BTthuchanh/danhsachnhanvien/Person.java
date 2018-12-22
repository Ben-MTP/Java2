package BTthuchanh.danhsachnhanvien;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	//1. Phuong thuc khoi tao:
	public Person() {
		
	}
	
	//2. Phuong thuc khoi tao 3 tham so:
	public Person(String name, int age, Address address) {
		this.name    = name;
		this.age     = age;
		this.address = address;
	}
	
	//3. Phuong thuc set/get cho tung thuoc tinh moi:
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Address getAddress() {
		return address;
	}
}
