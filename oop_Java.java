import mypack.Person;
public class oop_Java{
	public static void main(String[] args) {
		Person a = new Person("Quyet",25,164);

		a.eat("Com ga");
		int tuoi = a.getAge();

		System.out.println("His age:" + tuoi);

	}
}