package cdac;

public class ShapeAreaCalculatorMain {
	public static void main(String[] args) {
		ShapeAreaCalculator sc=new ShapeAreaCalculator ();
		sc.area(10);
		sc.area(5, 10);
		sc.area(9.0);
		sc.area(100, 80, false);
		 double triangleArea = sc.area(100, 80, true);
	        System.out.println("The Area of Triangle is: " + triangleArea);

	        // Parallelogram
	        double parallelogramArea = sc.area(100, 80, false);
	        System.out.println("The Area of Parallelogram is: " + parallelogramArea);
		
	}
}
