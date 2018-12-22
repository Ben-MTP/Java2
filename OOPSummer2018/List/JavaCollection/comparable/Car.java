package JavaCollection.comparable;

public class Car implements Comparable<Person>{
	private int id;
	private String hangXe;
	
	//Constructor:
	public Car(int id, String hangXe) {
		this.id = id;
		this.hangXe = hangXe;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	
	public int getId() {
		return id;
	}
	
	public String getHangXe() {
		return hangXe;
	}

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
