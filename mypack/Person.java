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

	public Person getInstance(){
		return this;
	}

	public void eat (String foodname){
		System.out.println(name + "is eating" + foodname);
	}

	public int getAge(){
		return age;
	}
}