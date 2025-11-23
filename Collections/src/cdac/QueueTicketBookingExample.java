package cdac;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTicketBookingExample {
	public static void main(String[] args) {
		Queue<Integer>qp=new PriorityQueue<>();
		qp.add(10);
		qp.add(20);
		qp.add(30);
		qp.add(40);
		qp.add(50);
		System.out.println("Queue is: "+qp);
		
		System.out.println("Dequeue  2 the elements....");
		System.out.println(qp.remove());
		System.out.println(qp.remove());
		System.out.println("Displaying peek means head element.....");
		System.out.println(qp.peek());
		System.out.println("Checking queue is empty or not.....");
		System.out.println(qp.isEmpty());
		
		
		
	}

}
