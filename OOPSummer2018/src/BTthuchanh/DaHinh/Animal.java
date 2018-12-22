package BTthuchanh.DaHinh;

import java.util.List;

public class Animal {
//	List<E>
	private String picture;
	private String food;
	private String hunger;
	private String boundaries;
	
	//Constructor khong tham so:
	public Animal() {
		
	}
	
	public void makeNoise() {
		System.out.println("Tieng keu");
	}
	public void eat() {
		System.out.println("Mon an yeu thich");
	}
	public void sleep() {
		System.out.println("Ngu theo kieu");
	}
	public void roam() {
		System.out.println("Di lai trong lanh tho");
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getHunger() {
		return hunger;
	}

	public void setHunger(String hunger) {
		this.hunger = hunger;
	}

	public String getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}
	
}
