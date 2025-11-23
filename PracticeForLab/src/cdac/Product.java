package cdac;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	 static int productcount=0;
public Product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		productcount++;
	 }
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
	 
 static	int getProductCount() {
	 return productcount;
		
	}
  static  void decrementCount() {
	  if(productcount>0) {
		  productcount--;
	  }
  }
	
}
