package cdac;

import java.util.Scanner;

 class BankAccount {
	//public static SavingsAccount SavingsAccount sa ;
	int accountno;
	double balance;
	BankAccount(int accountno,double balance){
		this.accountno=accountno;
		this.balance=balance;
		
	}
	void deposit(double amount) {
		balance+=amount;
		System.out.println("Diposited amount is: "+amount);
		System.out.println("Total Balance is: "+balance);
	}
}
	class SavingsAccount extends BankAccount {
		double intrestrate;
		SavingsAccount(int accountno, double balance, double intrestrate) {
			super(accountno, balance);
			this.intrestrate=intrestrate;
			
			
		}
		void calculateIntrest() {
			double intrest=(balance*intrestrate)/100;
			System.out.println("Intrest Earned is: "+intrest);
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account number: ");
			int accountno=sc.nextInt();
			System.out.println("Enter Balance: ");
			double balance=sc.nextDouble();
			System.out.println("Enter Intrest rate: ");
			double intrestrate=sc.nextDouble();
			
			SavingsAccount sa =new SavingsAccount(accountno,balance,intrestrate);
			System.out.println("Enter amount to deposit: ");
			double amount=sc.nextDouble();
			sa.deposit(amount);
			sa.calculateIntrest();
			sc.close();
			
		}
		
	}


