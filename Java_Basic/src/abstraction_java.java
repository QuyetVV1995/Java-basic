
public class abstraction_java {
	public static void main(String[] args) {
		student a = new student("Abstraction", 21, 164,"BachKhoa");
		byte b = 20;
		a.setAge(b);
		System.out.println(a.getAge());
		short c = 21;
		a.setAge(c);
		System.out.println(a.getAge());
		int d = 22;
		a.setAge(d);
		System.out.println(a.getAge());
	}

}
