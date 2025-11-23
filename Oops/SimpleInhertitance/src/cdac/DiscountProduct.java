package cdac;

import java.util.Scanner;

class Product {
	String productname;
	float productprice;
	Product(String productname,float productprice){
		this.productname=productname;
		this.productprice=productprice;
	}
	void showProduct() {
		System.out.println("Product Name: "+productname);
		System.out.println("Product Price: "+productprice);
		
	}
	
	

}
class DiscountProduct extends Product{
	float discountrate;
	DiscountProduct(String productname,int productprice,int discountrate){
		super(productname,productprice);
		this.discountrate=discountrate;
	}
	void calculateFinalPrice() {
		float discount=(productprice*discountrate)/100;
		float finalprice=productprice-discount;
		System.out.println("Discount is: "+discount);
		System.out.println("Final Price: "+finalprice);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Name: ");
		String productname=sc.next();
		System.out.println("Enter Product Price: ");
		int productprice=sc.nextInt();
		System.out.println("Enter Discount Rate: ");
		 int discountrate=sc.nextInt();
		 DiscountProduct dp=new DiscountProduct(productname,productprice,discountrate);
		 dp.showProduct();
		 dp.calculateFinalPrice();
		
	}
}