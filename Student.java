import mypack.Person;
public class Student extends Person{
	public String universityName;
	public Student (String name, int age, int heigth, String universityName){
		super(name, age, heigth);
		this.universityName = universityName;
	}
	
	public void getInfo(){
		super.getInfo();
		System.out.println("UniversityName: " + this.universityName);
	}
}