package cdac;

import java.util.Scanner;

public class ShoppingCartSystem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		CartManager cm=new CartManager();
		int choice;
		do {
			System.out.println("Shopping Cart Menu------");
			System.out.println("1-->Add Product");
			System.out.println("2--> View Product ");
			System.out.println("3--> Update Product");
			System.out.println("4--> Delete Productt");
			System.out.println("5--> Get Total Bill");
			System.out.println("6--> Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				cm.addProduct();
				break;
			case 2:
				cm.viewCart();
				break;
			case 3:
				cm.updateCart();
				break;
			case 4:
				cm.deleteProduct();
				break;
			case 5:
				cm.getTotalBill();
				break;
			case 6:
				System.out.println("Exiting.... Thankyou for visiting! ");
				break;
				default:
					System.out.println("Invalid choice! ");
			
			}
				
			}
			while(choice!=6);
		sc.close();
		}
	}


