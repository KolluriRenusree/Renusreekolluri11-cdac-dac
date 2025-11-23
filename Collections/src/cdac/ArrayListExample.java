package cdac;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Integer ele:al) {
			System.out.println(ele);
			
		}
		al.add(60);
		System.out.println("After adding....");
		for(Integer ele:al) {
			System.out.println(ele);
		}
		al.remove(2);
		System.out.println("After Removing....");
		for(Integer ele:al) {
			System.out.println(ele);
		}
		al.set(4,100);
		System.out.println("After Setting.....");
		for(Integer ele :al) {
			System.out.println(ele);
		}
		al.add(1,110);
		System.out.println("After updating....");
		for(Integer ele: al) {
		System.out.println(ele);
	}
	}

}
