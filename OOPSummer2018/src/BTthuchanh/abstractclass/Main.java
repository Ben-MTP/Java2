package BTthuchanh.abstractclass;

public class Main {
	public static void main(String[] args) {
		
		//Person person = new Person(); khong the goi 1 doi tuong tu lop Abstract
		Employee em = new Employee();
		em.setLuong(2000);
		em.setName("Minh Manh");
		System.out.println("Luong cua "+em.getName()+"la: "+em.getLuong()+"USD");
		System.out.println(em.getName()+"-"+em.keu());
		em.go();//Khong gia tri tra ve nen khong truyen duoc:
	
	}
}
