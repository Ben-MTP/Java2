package BTthuchanh.hamcobantrongjava;

import java.util.Random;

/* Ten class khong duoc la Math
 * */
public class Main {

	public static void main(String[] args) {
		/*In ra gia tri fix cung:
		* 1. Fix du lieu thong qua WapperClass;
		* 2. Fix cung du lieu thong qua bien:
		* 3. Fix cung du lieu thong qua:
		*/
		Integer giaTriA = new Integer(100);
		System.out.println(giaTriA);
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		//Ham tri tuyet doi:
		//Ham lam tron tren:
		//Ham lam tron xuong:
		//Lay max trong 2 so:
		//Lay min trong 2 so:
		//Lay luy thua (co so, mu):
		//Khai can:
		System.out.println(Math.sqrt(12.4));
		//Don vi goc la Radian:
		System.out.println(Math.sin(Math.PI/4));
		//Doi tu do sang Radian:
		System.out.println((Math.toRadians(90))/Math.PI);
		//Doi tu Radian sang do:
		System.out.println(Math.toDegrees(Math.PI/2));
		//Ramdom so tu n -> m;
		int ketQuaRanDom = getRandomIntInBetween(1, 100);
		System.out.println(ketQuaRanDom);
		
		//Random 100 so trong khoang tu 1 - 100;
		for(int i = 0; i < 100; i++) {
			ketQuaRanDom = getRandomIntInBetween(1, 101);
			System.out.print(ketQuaRanDom+", ");
		}
	}
	//Tao phuong thuc RamdomIntInBetween:
	public static int getRandomIntInBetween(int min, int max) {
		Random ra = new Random();
		
		//ra.nextInt(dua vao khong gia tri)
		int ketQua = min+ra.nextInt(max - min);
		return ketQua;
	}

}
