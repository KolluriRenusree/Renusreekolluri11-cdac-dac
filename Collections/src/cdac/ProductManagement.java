package cdac;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
	ArrayList<Product>al=new ArrayList<>();
	
	ArrayList<Product> add(){
		Product p1=new Product(0,"pen",10,2);
		Product p2=new Product(1,"penicl",5,2);
		Product p3=new Product(2,"drawings",100,1);
		Product p4=new Product(3,"Book",50,3);
		Product p5=new Product(4,"Bottle",40,2);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		System.out.println("Products Added Successfully!");
		return al;
		
		
	}
	void display() {
		System.out.println(al.toString());
	}
	void update() {
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to update");
		int id=sc.nextInt();
		for(Product p :al) {
			if(p.pid==id) {
				p.price=1000;
				System.out.println("Product price updated Sucessfully....");
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Id not found");
		}
		
		
	}
	void delete() {
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to delete");
		int id=sc.nextInt();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).pid==id) {
				al.remove(i);
				System.out.println("Product deleted Sucessfully....");
				found=true;
				break;
				
			}
		}
		if(!found) {
			System.out.println("Id not found");
		}
		
	}
	void totalInventory() {
		int sum=0;
		
		for(Product p :al) {
			 sum+=p.price*p.qty;
			
		}
		System.out.println("Total Sum of all Products is: "+sum);

	}

}
