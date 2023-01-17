package OOPConceptPart1;

public class WrapperClassConcept {
	public static void main(String[] args) {
		String x ="100";
		System.out.println(x+20);
		// data conversion :String to Int
		int i =Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer,double,charcater,boolean
		
		//String to double conversion
		String y="12.33";
		System.out.println(y+20);
		double d=Double.parseDouble(y);
	System.out.println(d+20);
	
	//String to Boolean
	String k ="true";
	boolean b=Boolean.parseBoolean(k);
	System.out.println(b);
			
	//inter to String conversion
	int j=200;
	System.out.println(j+200);
	String s=String.valueOf(j);
	System.out.println(s+20);
	
	String u ="100A";
	Integer.parseInt(u);//NumberFormatException.forInputString
	
	}
}