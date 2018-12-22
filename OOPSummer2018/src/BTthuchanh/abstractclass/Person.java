package BTthuchanh.abstractclass;

public abstract class Person {
	/* Trong abstract class co chua phuong thuc abstract:
	 * Thuoc tinh abstract
	 * Va nhung phuong thuc khong phai la abstract:
	 * 
	 * */
	public String name;
	//1. Ham khoi tao:
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void go();
	
	public abstract String keu();
	
	public String diaChi() {
		return "dia chi cua Person";
	}
}
