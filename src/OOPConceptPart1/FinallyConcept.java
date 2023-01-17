package OOPConceptPart1;

public class FinallyConcept {

	public static void main(String[] args) {
		test();

	}
	//finally keyword is always used with try catch block
	//Finally block is always executed 
public static void test() {
	try {
		System.out.println("inside test method");
		throw new RuntimeException("test");
	}
	catch(Exception e) {
		System.out.println("inside catch block");
	}
	finally {
		System.out.println("inside finally Block");
	}
}
}
