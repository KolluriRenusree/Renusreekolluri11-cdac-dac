package cdac;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		for(int i=1;i<6;i++) {
			s.push(i);
		
		}
		System.out.println(s);
		
		for(int i=1;i<3;i++) {
			s.pop();
		
		}
		System.out.println(s);
		System.out.println("Displyaing top of the element");
		System.out.println(s.peek());
		System.out.println("Checking stack is empty or not");
		System.out.println(s.isEmpty());
		
	}

}
