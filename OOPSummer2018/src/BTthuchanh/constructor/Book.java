package BTthuchanh.constructor;

public class Book {
	String name = "";
	String moTa = "";
	double price = 0.0;
	//Khai bao constructor:
	//1. Mac dinh khong tham so
	public Book() {
		
	}
	
	//2. Co tham so truyen vao: name, moTa;
	public Book(String name, String moTa) {
		this.name = name;
		this.moTa = moTa;
	}
	
	//3. Co 3 tham so truyen vao: name, moTa, price
	public Book(String name, String moTa, double price) {
		this.name = name;
		this.moTa = moTa;
		this.price = price;
	}
	
	//Khai bao cac phuong thuc set, get cho bien Instance:
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getMoTa() {
		return moTa;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
}
