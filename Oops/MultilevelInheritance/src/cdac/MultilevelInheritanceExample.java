package cdac;

class vehicle1
{
	String brand = "Ford";
	
	
void start()
{
	System.out.println("vehicle is starting");
}
	
}

class Car1 extends vehicle1
{
	int wheels = 4;
	
	
	void drive()
	{
		System.out.println("car is driving.....");
	}
	
	void displayCar()
	{
		System.out.println(wheels);
		System.out.println(brand);
	}
	
	
}

class ElectricCar extends Car1
{
	
	
	void charge()
	{
		System.out.println("Electric car is charging");
		
	}
	
	
	
}


class MultilevelInheritanceExample
{
	
	
	public static void main(String[] args) 
	{
		ElectricCar  c = new ElectricCar();
		c.start();
		c.drive();
		c.charge();		
		
		
	}
	
	
}
