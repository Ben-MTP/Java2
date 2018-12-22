package BTthuchanh.interfacephuongthuc;

/*Khai bao interface bang cach thay class bang inteface
 * interface khong phai la 1 class
 * interface la mot cach the hien
 * Trong interface chi co phuong thuc abstract, thuoc tinh abstract
 * Ngoai ra khong chua bat ki mot phong thuc nao khac
 * bat buoc toan bo phuong thuc trong do phai duoc khai bao lai
 * 
 * */
public interface Person {
	//Ham so cung la public abstract.
	public int HANG_SO = 100;
	//public int tuoi;
	//Trong interface khong co thuoc tinh instan:
	abstract void go();
	abstract String keu();
	abstract String hat();
}
