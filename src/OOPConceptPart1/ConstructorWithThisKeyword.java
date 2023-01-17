package OOPConceptPart1;

public class ConstructorWithThisKeyword {
	//class var
	// this keyword is used to initilize the class variable inside constructor
	String name;
	int age;
	
	public ConstructorWithThisKeyword (String name,int age) {
		this.name=name;//this.classvar=local var
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
	
	ConstructorWithThisKeyword obj =new ConstructorWithThisKeyword("tom",30);
	
}
}