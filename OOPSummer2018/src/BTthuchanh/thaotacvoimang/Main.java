package BTthuchanh.thaotacvoimang;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size: ");
		ThacTacVoiMang.nhapMang();
		System.out.println("Gia tri mang: ");
		ThacTacVoiMang.inMang();
		ThacTacVoiMang.sepMangTangDan();
		System.out.println("\nMang tang dan: ");
		ThacTacVoiMang.inMang();
		ThacTacVoiMang.sepMangGiamDan();
		System.out.println("\nMang giam dan: ");
		ThacTacVoiMang.inMang();
	}

}
