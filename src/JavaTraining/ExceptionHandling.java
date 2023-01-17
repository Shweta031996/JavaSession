package JavaTraining;

public class ExceptionHandling {
int a =10;
	public static void main(String[] args) throws InterruptedException {
		
		//uncaught exception
		int i =9/0;
		System.out.println(i);
		
//caught exception
		Thread.sleep(1000);
		
		ExceptionHandling obj = new ExceptionHandling();{
			obj=null;
			System.out.println(obj.a);
		}
		
	}

}
