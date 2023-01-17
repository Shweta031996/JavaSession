package OOPConceptPart1;

public class MethodInJava {
// Method also called function
	
	public static void main(String[] args) {
		
		 MethodInJava obj=new MethodInJava();
//one object will be created,obj is reference variable referring to the variable
// After creating the object, the copy of the all the non static method will be given to this  object
//main method is void never returns a value	 
// we cannot create method inside method we can call the method inside method
		 obj.test();
		 obj.pqr();
		 obj.qa();
		int l=obj.pqr();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
	}
		
	
	//non Static method
		//Void ==does not return anything
		
		//return type=void
	public void test(){ 
		System.out.println("test method");
		
	}
	//return type=int
	public int pqr() {
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=30;
		return c;
	}
	//return type=String
	public String qa() {
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
}
