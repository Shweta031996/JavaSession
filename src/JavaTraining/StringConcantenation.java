package JavaTraining;

public class StringConcantenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		String x="hello";
		String y="World";
		//Execution of java program start from the left to right 
	System.out.println(a+b);//300
	System.out.println(x+y);//helloWorld
	System.out.println(a+b+x+y);//300helloWorld
	System.out.println(x+y+a+b);//helloWorld100200
	System.out.println(x+y+(a+b));//helloWorld300
	System.out.println(a+b+x+y+a+x+b+y);//300helloWorld100hello200Worlds
	System.out.println("the value of a:"+a);
	
	}

}
