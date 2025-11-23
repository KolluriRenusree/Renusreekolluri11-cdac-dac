package cdac;

import java.util.Scanner;

public  abstract class Vehicle {
	int vehicleno;
	double rentalprice;
	public Vehicle(int vehicleno, double rentalprice) {
		
		this.vehicleno = vehicleno;
		this.rentalprice = rentalprice;
	}
	
	void calculaterent(int days) {
		double total=days*rentalprice;
		System.out.println("The Total rent is: "+total);
	}
	
}
class Car extends Vehicle{
	public Car(int vehicleno, double rentalprice) {
		super(vehicleno,rentalprice);
	}
	void calculaterent(int days) {

		double total=days*rentalprice;
		System.out.println("The total rent of Car is: "+total);
		
	}
	
}
class Bike extends Vehicle {
	public Bike(int vehicleno, double rentalprice) {
		super(vehicleno,rentalprice);
	}
	
	void calculaterent(int days) {
		double total=days*rentalprice;
System.out.println("The total rent for Bike is: "+total);
	
}
}
