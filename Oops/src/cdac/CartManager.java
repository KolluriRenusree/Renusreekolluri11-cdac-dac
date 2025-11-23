package cdac;

import java.util.Scanner;

public class CartManager {
	Product1[] cart=new Product1[10];
	int count;
	Scanner sc=new Scanner(System.in);
	void addProduct() {
		if(count>=cart.length) {
			System.out.println("Cart is full: ");
			return;
			
		}
		System.out.println("Enter Product id: ");
		int id=sc.nextInt();
		System.out.println("Enter Product Name: ");
		String name=sc.next();
		System.out.println("Enter Price: ");
		double price=sc.nextInt();
		System.out.println("Enter the Quantity: ");
		int qty=sc.nextInt();
		Product1 p=new Product1(id,name,price,qty);
		cart[count] = p;
		count++;
		System.out.println("Product is added successfully");
		
		
	}
		void viewCart() {
			if(count==0) {
				System.out.println("Cart is empty! ");
				return;
			}
//			System.out.println("Product Id is: ");
//			System.out.println("Product Name is: ");
//			System.out.println("Product Price is: ");
//			System.out.println("Product Quantity Is: ");
			
			for(int i=0;i<count;i++) {
				cart[i].display();
			}
			System.out.println("Total products: "+Product1.getProductCount());
			//Product1.getProductCount()
			
		}
		void updateCart() {
			System.out.println("Enter Product ID to update: ");
			int productid=sc.nextInt();
			System.out.println("Enter price to update: ");
			Double newprice=sc.nextDouble();
			System.out.println("Enter quantity to update: ");
			int newquantity=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(cart[i].productid==productid) {
					if(newprice>0)
						cart[i].price=newprice;
					if(newquantity>=0)
						cart[i].quantity=newquantity;
					System.out.println("Product updated successfully! ");
					return;
				}
			}
			System.out.println("product not found: ");
		}
		void deleteProduct() {
			System.out.println("enter the product id to delete: ");
			int productid=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(cart[i].productid==productid) {
					for(int j=i;j<count;j++) {
						cart[j]=cart[j+1];
						
					}
					cart[count-1]=null;
					count--;
					Product1.decrementCount();
					System.out.println("Product deleted successfully!");
					return;
				}
			}
			System.out.println("Product not found! ");
			
			
		}
		void getTotalBill() {
			double total=0;
			for(int i=0;i<count;i++) {
				total+=cart[i].price*cart[i].quantity;
			}
			System.out.println("Total Bill is: "+total);
		}
		
		}


