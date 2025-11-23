package cdac;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer>q= new PriorityQueue<>();
		for(int i=1;i<6;i++) {
			q.add(i);
			
		}
		System.out.println(q);
		System.out.println("Deleteing 2 elements");
		for(int i=1;i<3;i++) {
			q.remove(i);
		}
		System.out.println(q);
		System.out.println("Displaing peek Element");
		System.out.println(q.peek());
		System.out.println("Checking empty or not");
		System.out.println(q.isEmpty());
	}

}
