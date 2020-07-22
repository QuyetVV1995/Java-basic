public class static_java{
	// public static void main(String[] args) {
	// 	Student a = new Student("Quyet", 25, 1.6f);

	// 	System.out.println("University(from class):" + Student.universityName);
	// 	System.out.println("University(from instance):" + a.universityName);

	// 	System.out.println("Total(from class):" + Student.total);
	// 	Student b = new Student("Long", 24, 1.2f);

	// 	System.out.println("Total(from instance):" + b.total);

	// 	Student.getInfoUniversity();
	// }
	static String course;

	static {
		System.out.println("BKHN");
		course = "Java core";
	}

	public static void main(String[] args) {
		System.out.println(" Free");
		System.out.println("course:" + static_java.course);
	}
}