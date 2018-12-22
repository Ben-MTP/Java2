package JavaCollection.comparator;
/* Noi ve Comparable thi la Interface:
 * Ham sau khi implements comparable<Person>
 * bat Overide lai compareTo() --> 
 * */
public class Person{
	private int id;
	private String name;
	
	//Constructo:
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//set/get cho thuoc tinh:
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String in() {
		return id+" "+name;
	}
}
