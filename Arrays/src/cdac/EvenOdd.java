package cdac;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOddChecker(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		evenOddChecker(n);
	}

}
