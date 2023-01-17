package JavaTraining;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Dynamic array
		//1.can contain duplicate value
		//2.maintain insertion order
		//3.Synchronized 
		//4.It allows random access to fetch the element because it stores the values on the indexes
		
	ArrayList ar =new ArrayList();
	ar.add(100);//add the value
	ar.add(200);
	System.out.println(ar.size());//size of arrayList
		
     ar.add(300);
     ar.add(400);
     System.out.println(ar.size());
     
     ar.add("tom");
     ar.add(12.33);
     ar.add('2');
     ar.remove(3);
     System.out.println(ar.size());
     System.out.println(ar.get(2)); // to get the value from an index
    // System.out.println(ar.get(9));--IndexOutOfBoundsException
     
     // to print all the value use for loop
     for(int i=0;i<ar.size();i++) { 
    	 System.out.println(ar.get(i));
     }
    	 
    	 ArrayList<Integer> ar1= new  ArrayList<Integer> ();
    	 ar1.add(22);
    	 
    	 ArrayList<String> ar2= new  ArrayList<String> ();
    	 ar2.add("pqr");
    	 
    	 //Employee class object
    	 Employee e1=new Employee("shweta",25,"qa");
    	 Employee e2=new Employee("PARAM",30,"devops");
    	 //Create ArrayList
    	 ArrayList<Employee> ar4 = new ArrayList<Employee>();
    	 ar4.add(e1);
    	 ar4.add(e2);
    	 
    	 //iterator to traverse the values
    	// Iterator<Employee> it=ar4.iterator();
    	 
    	 //**************************************
    	 // addAll()
    	 ArrayList<String> ar5= new  ArrayList<String> ();
    	 ar5.add("sel");
    	 ar5.add("java");
    	 
    	 ArrayList<String> ar6= new  ArrayList<String> ();
    	 ar6.add("shweta");
    	 ar6.add("java123");
    	 ar6.add("shweta");
    	 
    	ar5.addAll(ar6);
    	for (int j=0;j<ar5.size();j++) {
    		System.out.println(ar5.get(j));
    	}
    	
    	//remove All
    	ar5.removeAll(ar6);
    	for (int j=0;j<ar5.size();j++) {
    		System.out.println(ar5.get(j));
    	}
    	//Retain All // to print common value between 2 arrayList
    	ar5.removeAll(ar6);
    	for (int j=0;j<ar5.size();j++) {
    		System.out.println(ar5.get(j));
    	}
    	
     }
     
}