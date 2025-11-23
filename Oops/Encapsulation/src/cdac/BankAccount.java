package cdac;
class Account{
	private String accountno;
	 private double balance;
	 public Account(String accountno, double balance) {
		
		this.accountno = accountno;
		this.balance = balance;
	 } 
	 //getter only for account number and balance protected
	 public String getaccountno() {
		 return accountno;
	 }
	 public void deposit(double amount) {
		 if(amount>0) {
			 System.out.println("Your Balance is: "+balance);
			 balance+=amount;
			 System.out.println("The deposit amount is: "+amount);
		 }
	 }
		 
		 public void withdraw(double amount) {
			 if(amount>0 && amount<=balance) {
				 balance-=amount;
			 System.out.println("Withdraw amount is: "+amount);
			 } 
		 
			 else {
			 System.out.println("Insufficient balance....");
		 }
	 }
	 
	 //Method to check balance no direct access
	 public double getbalance() {
		 return balance;
	 }
	 
	 
	 
}


public class BankAccount {
	public static void main(String[] args) {
		
		
		Account a=new Account("SBI21467800",10000);
		a.deposit(5000);
		a.withdraw(1000);
		System.out.println("remaning balance is: "+a.getbalance());
	}

}
