package cdac;

import java.util.Scanner;

public class BankAccount {
	long accno;
	String name;
	float balance;
	public BankAccount(long accno, String name, float balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
public void deposit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to deposit: ");
	float amount=sc.nextFloat();
	balance+=amount;
	System.out.println("Toatal balance is: "+balance);
	
}
public void withdraw() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to withdraw");
	float amount=sc.nextFloat();
	if(balance>=amount) {
	balance-=amount;
	System.out.println("Withdrawn successfully");
	}
	else {
		System.out.println("Insufficient fund");
	}
	System.out.println("Now Available balance after withdrawn is: "+balance);
}
public void checkBalance() {
	System.out.println("Available balance with "+name+ " & "+accno+"is: "+balance);
}
}
