package OOPConceptPart3Abstact;

public abstract class Shape {
	
	// abstract keyword is used to declare abstract class
		//cannot create object of abstract class
	//Abstract class have also have complete method as well as abstract method
	//can create the constructor of abstract class
	//hiding the implementation logic --is called abstraction 
	
	
	
	int color;
	abstract void drawing ();
	
	Shape(){
		System.out.println("shape class constructor");
	}
public void fill() {
	System.out.println("shape fill");
	
	
}

}
