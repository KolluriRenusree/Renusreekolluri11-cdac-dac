package cdac;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
	LinkedList<Integer>task=new LinkedList<>();
	for(int i=0;i<5;i++) {
		task.add(i);
	}
	System.out.println(task);
	task.addFirst(10);
	task.addLast(90);
	for(Integer ele:task) {
		System.out.println(ele);
	}
	System.out.println("removing Index 3");
	task.remove(3);
	for(Integer ele:task) {
		System.out.println(ele);
	}
	System.out.println("Getting First and Last Elements");
		task.getFirst();
		task.getLast();
		for(Integer ele:task) {
			System.out.println(ele);
		}
		System.out.println("Checking value Exist or not");
		System.out.println(task.contains(10));
		
	}
	
	
}
