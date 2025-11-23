package cdac;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer>task=new LinkedList<>();
		System.out.println("Adding 5 Integers into a Linkedlist.....");
		task.add(20);
		task.add(30);
		task.add(40);
		task.add(50);
		task.add(60);
		for(Integer ele:task) {
			System.out.println(ele);
		}
		System.out.println("Inserting a new Task at Beggining and End.....");
		task.addFirst(10);
		task.addLast(70);
		for(Integer ele:task) {
			System.out.println(ele);
		}
		System.out.println("Removing Middile Task....");
		task.remove(3);
		for(Integer e :task) {
			System.out.println(e);
		}
		System.out.println("Displaying First Task......");
		System.out.println(task.getFirst());
		System.out.println("Displaying Last Task......");
		System.out.println(task.getLast());
		System.out.println("Checking Specific Task Priority....");
		System.out.println(task.contains(10));
		
	}

}
