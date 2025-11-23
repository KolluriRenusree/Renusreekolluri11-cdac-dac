package cdac;

public  abstract class Order {
	int orderid;
	String customername;
	double amount;
	public Order(int orderid, String customername, double amount) {
		
		this.orderid = orderid;
		this.customername = customername;
		this.amount = amount;
	}
	void generateinvoke() {
		
	}
	

}
class OnlineOrder extends Order{
	public OnlineOrder(int orderid, String customername, double amount) {
		super(orderid,customername,amount);
}
	void generateinvoke( double deliverycharge) {
		double charge=amount+deliverycharge;
		System.out.println("The total amount including delivery charge is: "+charge);
	
		
	}
}
class StoreOrder extends Order{
	public StoreOrder(int orderid, String customername, double amount) {
		super(orderid,customername,amount);
}
	void generateinvoke( double discount) {
		double charge=amount-discount;
		System.out.println("The total amount after discount is: "+charge);
	
		
	}
	
}
