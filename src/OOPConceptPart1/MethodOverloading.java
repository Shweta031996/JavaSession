package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(0, 0);

	}
//you cannot create method inside method
//duplicate method is not allowed means same method name with same argument ,same datatype
//Method overloading --when the method with same name with different argument,different datatype or input parameter with the same class
//we can overload main method 
	
	public static void main(int a,int n) {
		
	}
	
	
	public void sum() {
	System.out.println("sum method--zero parameter");
}

public void sum(int i) {
	System.out.println("sum method");
	System.out.println(i);
	
}
public void sum(int k,int l) {
	System.out.println("sum method");
	System.out.println(k+1);
	
}
}