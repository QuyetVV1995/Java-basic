public class helloworld{
	public static void main(String[] args){
	// In hello world tren terminal window
	// System.out.println("Hello world");
	// System.out.println("Haaaaaaa");
	// System.out.println("123");
		try{
			int[] a = {5,6,7};
			System.out.println(a[4]);
		}
		catch (Exception e){
			System.out.println("index does not exist");
		}
	}
}