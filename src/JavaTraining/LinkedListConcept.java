package JavaTraining;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	//In linklist 

	public static void main(String[] args) {
		LinkedList <String> ll =new LinkedList<String>();
		//Add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("abxc");
		
		//print
		System.out.println(ll);
		
		//addFirst
		ll.addFirst("shweta");
		System.out.println(ll);
		
		//Addlast
		ll.addLast("param");
        System.out.println(ll);

       //get
       System.out.println(ll.get(0));

       //set
       ll.set(0, "tom");
       System.out.println(ll.get(0));
 
       //remove first and last element 
       ll.removeFirst();
       ll.removeLast();
      System.out.println(ll);
      
      ll.remove(2);
      System.out.println(ll);
      
      //how to print all the values of linkList :
      // for loop
      System.out.println("using for loop");
      for(int i=0;i<ll.size();i++)
      {
    	  System.out.println(ll.get(i));
      }
      
      //using iterator
      System.out.println("***using iterator");
      Iterator<String> it =ll.iterator() ; 
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      //while loop
      System.out.println("using while loop");
      int num=0;
      while(ll.size()>num) {
    	  System.out.println(ll.get(num));
    	  num++;
      }
}}




