package cdac;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pro=new Product[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product id: ");
		System.out.println("Product Name: ");
		System.out.println("Product Price: ");
		System.out.println("Product quantity: ");
		for(int i=0;i<pro.length;i++) {
			pro[i]=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
		}
		for(int i=0;i<pro.length;i++) {
			pro[i].display();
		}
		sc.close();
		
	}

}
