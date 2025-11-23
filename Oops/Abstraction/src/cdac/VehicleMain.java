package cdac;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int days=sc.nextInt();
		System.out.println("Enter the Number of days: ");
		int days=sc.nextInt();
		Car c=new Car(101,1000);
		Bike b=new Bike(102,100);
		
		c.calculaterent(days);
		b.calculaterent(days);

	}

}
