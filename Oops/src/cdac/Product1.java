package cdac;

public class Product1 {
	int productid;
	String productname;
	double price;
	int quantity;
	static int productcount=0;
	Product1(int productid,String productname,double price,int quantity){
		this.productid=productid;
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		productcount++;
	}
	 
	 void display() {
		 System.out.println("Product Id is: "+productid);
			System.out.println("Product Name is: "+productname);
			System.out.println("Product Price is: "+price);
			System.out.println("Product Quantity is: "+quantity);
	 }
	 static int getProductCount() {
		 return productcount;
	 }
	 static void decrementCount() {
		if(productcount>0) {
			productcount--;
		}
	}

}


