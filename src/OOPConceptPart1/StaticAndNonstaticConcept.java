package OOPConceptPart1;

public class StaticAndNonstaticConcept {
	
	//the scope of global variable across all the variable
	
String name="tom";//non static global variable
static int age =25; //static global variable 
	
	
	public static void main(String[] args) {
		//how to call static method and var:
		//1.direct calling
		sum();
		System.out.println(age);
		
		//2.Calling by Classname
		StaticAndNonstaticConcept.sum();
		System.out.println(StaticAndNonstaticConcept.age);
		
		//How to call non static method and var :
		StaticAndNonstaticConcept obj= new StaticAndNonstaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference ?Yes
		obj.sum();
		
	}

	
	public void sendmail() {
		System.out.println("send mail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}
}

