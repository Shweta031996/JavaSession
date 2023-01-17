package OOPConceptPart1;

public class ConstructorConcept {
	// Constructor --> entity which is used to define some class features while creating object
	//Constructor name same as class name
	//default constructor -- zero parameter constructor
	//we can overload constructor with different parameter
	//jvm will call the defult constructor
	//constructor can create inside class outside main method
	
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("single param constructor");
		System.out.println("the value of i "+1);
		
	}
	public ConstructorConcept(int i,int j) {
		System.out.println("single param constructor");
		System.out.println("the value of i "+1);
		System.out.println("the value of j "+1);
		
	}
	public static void main(String[] args) {

		ConstructorConcept obj= new ConstructorConcept();
		//ConstructorConcept obj1= new ConstructorConcept(10);
		//ConstructorConcept obj2= new ConstructorConcept(10,10);
	}

}
