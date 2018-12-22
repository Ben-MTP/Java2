package BTthuchanh.DaHinh;

public class Wolf extends Canine{
	@Override
	public void makeNoise() {
		System.out.println("Keu theo kieu Wolf");
	}
	
	@Override
	public void eat() {
		System.out.println("An theo kieu Wolf");
	}
}
