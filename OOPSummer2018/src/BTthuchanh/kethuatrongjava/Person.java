package BTthuchanh.kethuatrongjava;
/*Day la class chung nhat
 * chua thong tin nhu name, age, address
 * 1. Muc do dau dien la bien class co the truy cap duoc
 * */
public class Person {
	String name = " ";
	int age = 1;
	String address = " ";
	//2. Phuong thuc khoi tao khong tham so:
	public Person() {
		
	}
	//1. Cung khoi tao phuong thuc set, get cho bien doi tuong:
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
}
