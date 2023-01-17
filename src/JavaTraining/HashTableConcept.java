package JavaTraining;

import java.util.Hashtable;

public class HashTableConcept {
	
	public static void main(String[] args) {
		Hashtable h =new Hashtable();
		h.put("A","Test");
		h.put("B","Hello");
		h.put("c","World");
		System.out.println(h.size());
		h.put(1,"100");
		h.put(2,"200");
		
		System.out.println(h.get("A"));
		System.out.println(h.get(1));
		h.put(3, "tom");
		
		// key and 
		Hashtable <Integer,Integer> h1 =new Hashtable<Integer,Integer>();
		h1.put(1, 2);
		
		Hashtable <String,Integer> h2 =new Hashtable<String,Integer>();
		h2.put("dsdd", 1);
	}

	
}