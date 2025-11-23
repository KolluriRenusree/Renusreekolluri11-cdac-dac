package cdac;

import java.util.HashMap;
import java.util.Map.Entry;

public class Libray {
	public static void main(String[] args) {
		HashMap<Integer,Book>hm=new HashMap<>();
		Book b1=new Book(101,"java","james",2000);
		Book b2=new Book(102,"Python","ravi",2080);
		Book b3=new Book(103,"C","dennis",3903);
		Book b4=new Book(104,"C++","swas",1700);
		Book b5=new Book(105," C#","renu",6000);
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		hm.put(4, b4);
		hm.put(5, b5);
		System.out.println("Retriving a book");
		System.out.println(hm.get(1));
		System.out.println("Checking Book id Exist or not");
		System.out.println(hm.containsKey(5));
		System.out.println("Checking Particular Book Exist or not");
		System.out.println(hm.containsValue(b4));
		System.out.println("Checking HashMap size");
		System.out.println(hm.size());
		System.out.println("Iterating ");
		for(Entry<Integer, Book> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.replace(1,b2);
		for(Entry<Integer, Book> m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
	}

}
