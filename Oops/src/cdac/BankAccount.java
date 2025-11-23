package cdac;

import java.util.Scanner;

public class BankAccount {
	long accountnumber;
	String holdername;
	double balence;
	BankAccount(long accountnumber,String holdername,double balence){
		this.accountnumber=accountnumber;
		this.holdername=holdername;
		this.balence=balence;
	}
	void deposit(double amount) {
		balence+=amount;
		System.out.println("Deposited: "+amount);
	}
	void withdraw(double amount) {
		if(amount<=balence) {
			balence-=amount;
			System.out.println("Withdrawn: "+amount);
			
		}else {
			System.out.println("Insufficient Balence!");
		}
		}
	void checkBalence() {
		System.out.println("Balence is: "+balence);
		
	}
	void display() {
		 System.out.println("Account Number: " + accountnumber);
	     System.out.println("Holder Name: " + holdername);
	     System.out.println("Initial Balance: " + balence);
//	     deposit(1000);             // Depositing 1000
//	     withdraw(500);     
	     // Withdrawing 500
	     System.out.print("Enter amount to deposit: ");
	        Scanner sc=new Scanner(System.in);
			double depositAmount = sc.nextDouble();
	        deposit(depositAmount);
	     System.out.print("Enter amount to withdraw: ");
	        double withdrawAmount = sc.nextDouble();
	        withdraw(withdrawAmount);
	        checkBalence();   

	}
	@Override
	public String toString() {
		return "BankAccount [accountnumber=" + accountnumber + ", holdername=" + holdername + ", balence=" + balence
				+ "]";
	}
	
	

}
