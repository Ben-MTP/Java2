package BTthuchanh.DaHinh;

public class Cat extends Feline{
	@Override
	public void makeNoise() {
		System.out.println("Keu tieng con Cat");
	}
	
	public void eat() {
		System.out.println("An theo kieu con Cat");
	}
}
