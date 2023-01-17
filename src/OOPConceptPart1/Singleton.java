package OOPConceptPart1;

public  class Singleton  {
//a singleton class is a class that can have only one object (an instance of the class) at a time
//how do design the singleton class:
//1.Make constructor as a private
//2.Write a public static method that has return type of object  of this singleton class(Lazy initialization)	
	
	private static Singleton single_instance = null;
	public String s;
	private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
	
	public static Singleton getInstance()
    {
		if (single_instance == null)
            single_instance = new Singleton();
  
        return single_instance;
    }
	
	public static void main(String[] args) {
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		x.s=(x.s).toUpperCase();
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		
		
	}

}