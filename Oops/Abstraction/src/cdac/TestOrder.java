package cdac;

import java.util.Scanner;

public class TestOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Discount Amount: ");
		double discount=sc.nextDouble();
		System.out.println("Enter the Delivery Charges: ");
		double deliverycharge=sc.nextDouble();
		OnlineOrder o=new OnlineOrder(101,"renu",1000);
		StoreOrder s=new StoreOrder(102,"sree",2000);
		o.generateinvoke(deliverycharge);
		s.generateinvoke(discount);
		
	}

}
