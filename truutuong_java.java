import mypack.Person;


public class setter_getter_java{
	public static void main(String[] args) {
		Person a = new Person("setter_getter_java", 21, 21);
		System.out.println(a.getAge());
		a.setAge(22);
		System.out.println(a.getAge());
		a.setAge(-2);
		System.out.println(a.getAge());
	}
}