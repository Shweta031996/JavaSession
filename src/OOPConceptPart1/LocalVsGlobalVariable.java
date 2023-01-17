package OOPConceptPart1;

public class LocalVsGlobalVariable {
	//Global Variable--Class variable
	// to use the non static global variable we need to create the object of the class
	String name="tom";
	int age=25;
	public static void main(String[] args) {
		
		int i=10;//local variable
		System.out.println(i);
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
	System.out.println(obj.name); 
	System.out.println(obj.age); 
		
	}
	
	public void sum() {
		
		int i=10;//local variable
		int j=20;//local variable
		
		
	}
}


