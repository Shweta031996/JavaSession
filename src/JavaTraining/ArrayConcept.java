package JavaTraining;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int array
	int i[]= {1,2,3,4};
	int j []=new int[4];
	j[0]=8;
	j[1]=9;
	j[2]=6;
	j[3]=9;
	for (int k=0;k<i.length;k++) {
		System.out.println(i[k]);
	}

	// double array
	double d[]=new double[4];
	d[0]=12.22;
	d[1]=13.33;
	d[2]=66.23;
	d[3]=12.33;
//  char array
	char c[]=new char [2];
	c[0]='w';
	c[1]='m';
	
//string array
	String s []=new String[2];
	//Boolean array
	boolean b[]=new boolean[2];
	System.out.println(d[0]);
	
	// disadvantage array
	//1.size is fixed-->to overcome this problem collection is used
	//2.stores only similar data type-->to overcome this problem object arrayy
	
	//object array-->used to store the different data type value
	//object is super class of all the class
	Object o[]=new Object[4];
	o[0]="TOM";
	o[1]=24;
	o[2]=12.22;
	o[3]='l';
	System.out.println(o[0]);
	System.out.println(o.length);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
}