package cdac;

import java.util.HashMap;
import java.util.Map;

public class HashMapLibraryManagementExample {
	public static void main(String[] args) {
		HashMap<Integer,Book>hm=new HashMap<>();
		System.out.println("Adding Boks to Library.....");
		Book b1=new Book(101,"java","james",1000);
		Book b2=new Book(102,"C","Dennis",2000);
		Book b3=new Book(103,"C#","jhons",5000);
		Book b4=new Book(104,"C++","jenny",4000);
		Book b5=new Book(105,"Python","janu",9000);
		Book b6=new Book(104,"C++","jenny",400);
		hm.put(101, b1);
		hm.put(102, b2);
		hm.put(103, b3);
		hm.put(104, b4);
		hm.put(105, b5);
		System.out.println("Retriving Book.....");
		System.out.println(hm.get(101));
		System.out.println(hm.containsKey(102));
		System.out.println(hm.size());
		for(Map.Entry<Integer,Book>m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
			System.out.println(hm.keySet());
			System.out.println(hm.values());
			System.out.println("..............................");
			//System.out.println(hm.remove(104, b6));
			
		
		System.out.println(hm.remove(101));
		System.out.println("..............................");
		hm.clear();
		
		System.out.println(hm.isEmpty());
		}
		
	}


