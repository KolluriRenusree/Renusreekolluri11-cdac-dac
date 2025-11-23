package cdac;

import java.util.Scanner;

class Vehicle  {
	String brand;
	int fuel;
	Vehicle(String brand,int fuel){
		this.brand=brand;
		this.fuel=fuel;
		
	}
	void refuel(int liters) {
		fuel+=liters;
		System.out.println("Refueled: "+liters);
		System.out.println("Total  liters of fuel is: " +fuel);
		
	}
	
}
class Car extends Vehicle{
	int mileage;
	Car(String brand,int fuel,int mileage){
		super(brand,fuel);
		this.mileage=mileage;
	}
	
	void calculatedistance() {
		int distance=fuel*mileage;
		System.out.println("Car can travel: "+distance+"Km");
		
		
	}
	public static void main(String args[]) {
		System.out.println("Enter the brand: ");
		Scanner sc=new Scanner(System.in);
		
		String brand=sc.next();
		System.out.println("Enter No liters of fuel to fill: ");
		int fuel=sc.nextInt();
		System.out.println("Enter No of Kilometers: ");
		int distance=sc.nextInt();
		//System.out.println();
		Car c=new Car(brand,fuel,distance);
		System.out.println("Do you want to refuel more? (yes/no)");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter how many liters to refuel: ");
            int moreFuel = sc.nextInt();
            c.refuel(moreFuel);
        }
		c.calculatedistance();
		
		
	}
}
