
public class student extends Person{
	public String universityName;
	
	public student(String name, int age, int heigth,String universityName) {
		super (name, age, heigth);
		this.universityName = universityName;
	}
	
	public void getInfo () {
		super.getInfo();
		System.out.println("University Name:" +this.universityName);
	}
	
	@Override
	public Object clone() {
		student other = new student(this.name, this.getAge(), this.heigth, this.universityName);
		return other;
	}
}
