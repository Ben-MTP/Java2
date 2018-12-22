package BTthuchanh.interfacephuongthuc;

public class Employee implements Person{
	//1. Thuoc tinh class Employee
	private String name;
	private int luong;
	private int age;
	public Employee() {
		
	}
	public Employee(String name, int luong, int age) {
		this.name = name;
		this.luong = luong;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public int getLuong() {
		return luong;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	//Dinh nghia lai toan bo phuong thuc trong do:
	public void go() {
		System.out.println("Chay theo duong thang");
	}
	
	public String keu() {
		return "Noi Tieng Anh";
	}
	
	public String hat() {
		return "O la la...";
	}
	
	public String getEmployee() {
		return name+" "+luong+" "+ age;
	}
}
