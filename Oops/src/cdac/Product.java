package cdac;

public class Product {
	int productid;
	String proudctname;
	double price;
	int quantity;
	Product(int productid,String productname,double price,int quantity){
		this.productid=productid;
		this.proudctname=productname;
		this.price=price;
		this.quantity=quantity;
	}
		 double totalPrice(){
			return price*quantity;
			
	}
		 double totalBill() {
			 double Totalbill=0;
			 
			 Totalbill+=totalPrice();
			 return Totalbill;
			 
		 }
		 void display() {
			 System.out.println("Product id is: "+productid);
			 System.out.println("Product name is: "+proudctname);
			 System.out.println("Product Price is: "+price);
			 System.out.println("product Quantity is: "+quantity);
			 //System.out.println("TotalPrice is:" +totalPrice());
			 System.out.println("TotalBill is: "+totalBill());
			 
			 
			 
			 
		 }
		 			 
		 }
	


