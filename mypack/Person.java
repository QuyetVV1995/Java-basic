package mypack;
public class Person{
	public String name;
	public int age;
	public int heigth;

	public Person(String name, int age, int heigth){
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	public void getInfo(){
		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
		System.out.println("Heigth:" + this.heigth);
	}
}