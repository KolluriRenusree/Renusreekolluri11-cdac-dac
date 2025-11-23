package cdac;

public class TestPayment {

	public static void main(String[] args) {
		CreditCardPayment c= new CreditCardPayment ("12345","098765");
		UPIPayment p=new UPIPayment("09876","123456");
		c.processPayment(1000);
		c.refund(100);
		p.processPayment(2000);
		p.refund(200);
		
		
		

	}

}
