package BTthuchanh.DaHinh;

public class Hippo extends Animal{
	//Constructo:
	public Hippo() {
		
	}
	@Override
	public void makeNoise() {
		System.out.println("Keu theo tieng con Hippo");
	}
	
	public void eat() {
		System.out.println("An theo kieu con Hippo");
	}
}
