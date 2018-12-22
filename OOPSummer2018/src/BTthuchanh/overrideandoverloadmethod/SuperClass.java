package BTthuchanh.overrideandoverloadmethod;

public class SuperClass {
	//1. class super chua nhung phuong thuc rieng cua no:
	public int tongHaiSo(int a, int b) {
		return a+b;
	}
	
	public int tongHaiSo() {
		return 10;
	}
	
	public int tongHaiSo(int a) {
		return a+100;
	}
	
	public float tongHaiSo(float a, float b) {
		return a+b;
	}
	
	public float tongHaiSo(float a) {
		return (a+ (float)12.12);
	}
	
}
