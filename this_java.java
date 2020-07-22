import mypack.Person;

public class this_java{
	public static void main(String[] args) {
		Person a = new Person("quyet", 21, 164);
		System.out.println(a);
		System.out.println(a.getInstance());
		Person b = a;
		Person c = a.getInstance();
		System.out.println(b);
		System.out.println(c);
		// ket qua deu tra ve chung 1 gia tri, gia tri in ra theo kieu quy tac
		// kieu du lieu tham chieu: [ten lop]@[vi tri luu tru]
	}
}