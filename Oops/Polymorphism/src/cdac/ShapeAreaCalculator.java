package cdac;

public class ShapeAreaCalculator {
	void area(int side) {
		int square=side*side;
		System.out.println("The Area of Square is: "+square);
	}
	void area(int length,int breadth) {
		int rectangle=length*breadth;
		System.out.println("The Area of Recatangle is:  "+rectangle);
	}
	void area(double radius) {
		double circle=Math.PI*radius*radius;
		System.out.println("The Area of Circle is: "+circle);
	}
	double area(double base,double height,boolean isTriangle ) {
		if(isTriangle) {
	System.out.println("The Area of Triangle is: " );

			return 0.5*height*base;
			
		
		}
		else 
			System.out.println("The Area of Parallelogram is: " );
		
			return base*height;
	}
}


