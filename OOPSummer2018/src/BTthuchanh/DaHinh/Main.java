package BTthuchanh.DaHinh;

public class Main {

	public static void main(String[] args) {
		/*Xay dung moi quan he Da Hinh tren cay quan he Animal
		 * Xay dung mot mang chua doi tuong Animal
		 */
		Animal [] ani = new Animal[3];
		ani[0] = new Feline();
		ani[1] = new Canine();
		ani[2] = new Hippo();
		
		//Khoi tao doi tuong Feline:
		Feline[] fel = new Feline[3];
		fel[0] = new Lion();
		fel[1] = new Cat();
		fel[2] = new Tiger();
		
		for(int i = 0; i < fel.length; i++) {
			fel[i].makeNoise();
			fel[i].eat();
		}
		//Goi lien ket:
//		ani[0].
	}
}
