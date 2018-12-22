package BTthuchanh.overrideandoverloadmethod;

public class SupClass extends SuperClass{
	//Chinh sua lai phuong thuc cua lop cho, de lop con su dung rieng:
	public int tongHaiSo(int a) {
		System.out.println(super.tongHaiSo(a));
		//Chinh sua ben trong khong can quan tam:
		return a+101;
	}
	
	public float tongHaiSo(float a, float b) {
		return a+b+110;
	}
}
