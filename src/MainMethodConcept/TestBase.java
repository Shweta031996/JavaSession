package MainMethodConcept;

public class TestBase {

	//JVM calls this  --main (String[] args[])--public static void
	// JVM searches for the main method which is public, static, 
	//with return type void, and a String array as an argument and calls it.
	// we can call main method one class to another
	public static void main(String[] args) {
   System.out.println("main method 1");
	}
	
	public static void main(int a) {
		System.out.println("main method 2");
		
}
	public static void main(int a, int b) {
		System.out.println("main method 3");
	
}
	}