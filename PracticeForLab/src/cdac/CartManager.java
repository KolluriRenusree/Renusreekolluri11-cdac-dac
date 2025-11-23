package cdac;

import java.util.Scanner;

public class CartManager {
	Product[]cart=new Product[5];
	int count=0;
	Scanner sc=new Scanner(System.in);
	void addProduct() {
		if(count>=cart.length) {
			System.out.println("cart is full");
			
		}
		System.out.println("enter Prouduct id: ");
		int id=sc.nextInt();
		System.out.println("enter Prouduct name: ");
		String name=sc.next();
		System.out.println("enter Prouduct price: ");
		double price=sc.nextDouble();
		System.out.println("enter Prouduct quantity: ");
		int qty=sc.nextInt();
		Product p1=new Product(id,name,price,qty);
		cart[count]=p1;
		count++;
		
		
	}
	void viewCart() {
		if(count==0) {
			System.out.println("Cart is empty");
		}
		else {
			for(int i=0;i<count;i++) {
				System.out.println(cart[i].toString());
			}
			System.out.println("Total Product count is: "+Product.getProductCount());
		}
	}
	void updateproduct() {
		System.out.println("Enter Product id to update");
		int pid=sc.nextInt();
		System.out.println("Enter Product price to update");
		float pprice=sc.nextFloat();
		System.out.println("enter quantity to update");
		int qty=sc.nextInt();
		for(int i=0;i<cart.length;i++) {
			if(cart[i].id==pid) 
				if(pprice>0)
				cart[i].price=pprice;
			if(qty>0) 
				cart[i].quantity=qty;
			return;
		}
		
	}
	void deleteProduct() {
		System.out.println("Enter Product id to delete");
		int pid=sc.nextInt();
		for(int i=0;i<count;i++) {
			if(cart[i].id==pid) {
				for(int j=i;j<count;j++) {
					cart[j]=cart[j+1];
					
				}
				cart[count-1]=null;
				count--;
			}
		}
		
		
	}
	void gettotalBill() {
		double total=0;
		for(int i=0;i<count;i++) {
		total=cart[i].price*cart[i].quantity;
		}
		System.out.println("Total bill is "+total);
	}

}
