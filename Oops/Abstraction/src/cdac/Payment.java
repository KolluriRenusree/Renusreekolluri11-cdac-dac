package cdac;

public interface Payment {
	public  void processPayment(double amount);
	public void refund(double amount);
	
	

}
class CreditCardPayment implements Payment{
	String transcationid;
	String accountnumber;
	public CreditCardPayment(String transcationid, String accountnumber) {
		
		this.transcationid = transcationid;
		this.accountnumber = accountnumber;
	}
	
	public void processPayment(double amount) {
		System.out.println("Processing credit card Payment......");
		System.out.println("Transcation id is : "+transcationid);
		
	}
	 public void refund(double amount) {
		System.out.println("Refunding Rs "+amount+"to Credicard account "+accountnumber);
		
	}
}
 class UPIPayment implements Payment{
	 String transcationid;
		String accountnumber;
	 
	public UPIPayment(String transcationid, String accountnumber) {
		this.transcationid = transcationid;
		this.accountnumber = accountnumber;
		
		}
	
	 public void processPayment(double amount) {
		System.out.println("Processing UPI Payment......");
		System.out.println("Transcation id is : "+transcationid);
		
		
	}
	 public void refund(double amount) {
	 System.out.println("Refunding Rs "+amount+"to Credicard account "+accountnumber);
		
		
	}
	
}
