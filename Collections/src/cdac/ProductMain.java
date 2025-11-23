package cdac;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductManagement pm=new ProductManagement();
		int choice;
		do {
			System.out.println("Product Menu .............");
			System.out.println("1--> Adding Products");
			System.out.println("2--> Displaying Product");
			System.out.println("3--> Updating Product");
			System.out.println("4--> Deleting Products");
			System.out.println("5--> Total Inventory ");
			System.out.println("6--> exit");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				pm.add();
				break;
			case 2:
				pm.display();
				break;
			case 3:
				pm.update();
				break;
			case 4:
				pm.delete();
				break;
			case 5:
				pm.totalInventory();
				break;
			case 6:
				System.out.println("Exiting...");
				break;
				default:
					System.out.println("Invalid Choice");
				
				}
			
		}
		while(choice!=7);
		sc.close();
			

	}

}
