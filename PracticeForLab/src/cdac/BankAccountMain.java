package cdac;


public class BankAccountMain {
	public static void main(String[] args) {
	BankAccount b1=new BankAccount(10029389,"renu",10000);
		BankAccount b2=new BankAccount(10029388,"lucky",90000);
		BankAccount b3=new BankAccount(10029387,"lehana",60000);
		b1.deposit();
		b1.withdraw();
		b1.checkBalance();
		b2.deposit();
		b2.withdraw();
		b2.checkBalance();
		b3.deposit();
		b3.withdraw();
		b3.checkBalance();
		
		
	}

}
