package BTthuchanh.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khoi tao doi tuong sach tuong ung voi tung constructo:
		//1. Khong tham so truyen vao - mac dinh:
		Book book1 = new Book();
		book1.setName("Aliba va 40 ten cuop");
		book1.setMoTa("Sach cho thieu nhi");
		book1.setPrice(40000);
		
		Book book2 = new Book("Co be quang khan do", "Sach cho thieu nhi");
		book2.setPrice(30000);
		Book book3 = new Book("Co be ban diem", "Sach cho thieu nhi", 50000);
		
		//In thong tin ve cac doi tuong vua tao:
		System.out.println(book1.getName()+" "+book1.getMoTa()+" "+book1.getPrice());
		System.out.println(book2.getName()+" "+book2.getMoTa()+" "+book2.getPrice());
		System.out.println(book3.getName()+" "+book3.getMoTa()+" "+book3.getPrice());

	}

}
