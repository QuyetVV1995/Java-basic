public class Student{
	public String name;
	public int age;
	public float heigth;

	public static String universityName = "BKHN";
	public static int total = 0;

	public Student(String name, int age, float heigth){
		this.name = name;
		this.age = age;
		this.heigth = heigth;

		total += 1;
	}

	// phương thức tĩnh
	public static void getInfoUniversity(){
		System.out.println("Bach khoa ha noi");
	}
}