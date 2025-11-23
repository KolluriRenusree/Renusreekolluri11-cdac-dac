package cdac;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry; 

public class HashExample {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		//System.out.println("Adding books");
		hm.put(1,"acts banglore");
		hm.put(2, "Renusree Chowdhary");
		hm.put(3,"Dinesh Kumar");
		hm.put(4, "Reddeppa Naidu");
		hm.put(5, "Hamsaveni");
		System.out.println("Retriving book");
		System.out.println(hm.get(1));
		System.out.println("Checking book exist");
		System.out.println(hm.containsKey(2));
		System.out.println("Displaying total number of books");
		System.out.println(hm.size());
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
			
			
		}
		System.out.println("Updating price");
		hm.replace(1, "renu");
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
			
			
		}
		System.out.println("Remove Book");
		hm.remove(2);
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
			
			
		}
		System.out.println("clearing all books");
		hm.clear();
		
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
			
			
			
		}
		System.out.println("Checking is empty");
		System.out.println(hm.isEmpty());
	}
}
