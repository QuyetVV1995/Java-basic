public class epkieutrongJava{
	/*
	Neu ep kieu du lieu ki tu char sang kieu du lieu so
	hoac nguoc lai, khi ep kieu char sang so thi ep kieu
	ngam dinh ki tu sang he thap phan ASCII tuong ung
	ki tu do. Neu nguoc lai thi phai su dung ep kieu tuong 
	minh de chuyen sang kieu ki tu
	*/

	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		char c = (char) b;
		System.out.println(b);
		System.out.println(c);
	}
}