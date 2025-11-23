package cdac;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		System.out.println("Pushing 5 Elements into stack...");
		s.push(30);
		s.push(25);
		s.push(22);
		s.push(19);
		s.push(29);
		for(Integer ele:s) {
			System.out.println(ele);
		}
		System.out.println("poping the top 2 values of stack....");
		s.pop();
		s.pop();
		for(Integer ele :s) {
			System.out.println(ele);
		}
		System.out.println("Printing the top element of the stack.....");
		s.peek();

		System.out.println(s.peek());
		System.out.println("Checking the Stack is Empty or not...");
		System.out.println(s.isEmpty());

		
		}

}
