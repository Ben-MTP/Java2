package JavaCollection.comparable;
/* Noi ve Comparable thi la Interface:
 * Ham sau khi implements comparable<Person>
 * bat Overide lai compareTo() --> 
 * */
public class Person implements Comparable<Person>{
	private int id;
	private String name;
	
	//Constructo:
	public Person(int id, String name) {
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
	@Override
	/*Dung de so sanh Id cho Person trong qua trinh sap xep: 
	 * */
	public int compareTo(Person o) {
		if(this.getId() > o.getId()) {
			return 1;
		} else if(this.getId() == o.getId()) {
			return 0;
		} else
		return -1;
	}
	
	//Sap theo ten:
	public int compareTo1(Person o) {
	return 1;
	}
}
