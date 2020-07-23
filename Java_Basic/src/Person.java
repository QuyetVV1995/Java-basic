
public abstract class Person {
	
	public	String name;
	private	int age;
	public	int heigth;
	
	public Person(String name, int age, int heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}
	public void setAge(int age){
		if(age>= 0 && age<=100){
			this.age = age;
		}
	}
	public void setAge(byte age){
		if(age>= 0 && age<=100){
			this.age = age;
		}
	}
	
	public void setAge(short age){
		if(age>= 0 && age<=100){
			this.age = age;
		}
	}
	

	public int getAge(){
		return this.age;
	}
	
	public abstract Object clone();
	
	public void getInfo(){
		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
		System.out.println("Heigth:" + this.heigth);
	}

}
