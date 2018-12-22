package JavaCollection.HashSet;

public class Person {
	private int id;
	
	//Contructor:
	public Person(int id) {
		super();
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		return (obj instanceof Person)?(((Person)obj).getId() == this.id):false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
}
