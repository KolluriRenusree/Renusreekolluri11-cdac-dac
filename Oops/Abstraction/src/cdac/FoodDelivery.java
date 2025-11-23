package cdac;

public interface FoodDelivery {
	void placeOrder(String items,int quantity);
	void cancelOrder(int orderid);
	void trackOrder(int orderid);

}
class ZomatoDelivery implements FoodDelivery{
	int orderid;
	String restaurantname;
	String status;
	public ZomatoDelivery(int orderid, String restaurantname, String status) {
		super();
		this.orderid = orderid;
		this.restaurantname = restaurantname;
		this.status = status;
	}
	@Override
	public void placeOrder(String items, int quantity) {
		double price=100*quantity;
		double packagecharges=100;
		double total=price+packagecharges;
		status="OrderPacked";
		System.out.println("Zomato Order Placed: "+items+" X "+quantity);
		System.out.println("The Total amount including package Charges is: "+total);
		
	}
	@Override
	public void cancelOrder(int orderid) {
		if(this.orderid==orderid) {
			status="Cancelled";
			System.out.println("Zomato Order with id "+orderid+" Cancelled Sucessfully!..");
		}
		
		
		
	}

	@Override
	public void trackOrder(int orderid) {
		if(this.orderid==orderid) {
			System.out.println("Zomato Order Status is "+status);
			
		}
		
		
	}
	
	
}
class SwiggyDelivery implements FoodDelivery{
	int orderid;
	String restaurantname;
	String status;
	public SwiggyDelivery(int orderid, String restaurantname, String status) {
		super();
		this.orderid = orderid;
		this.restaurantname = restaurantname;
		this.status = status;
	}
	@Override
	public void placeOrder(String items, int quantity) {
		double price=100*quantity;
		double packagecharges=100;
		double total=price+packagecharges;
		double cashprice=total*0.10;
		status="Order Preparing";
		System.out.println("Swiggy Order Placed: "+items+" X "+quantity+" Status is "+status);
		System.out.println("The Total amount including package Charges is: "+total);
		System.out.println("The cash price for this order is: "+cashprice);
		
		
	}
	@Override
	public void cancelOrder(int orderid) {
		if(this.orderid==orderid) {
			status="Cancelled";
			System.out.println("Swiggy Order with id "+orderid+" Cancelled Sucessfully!..");
		}
		
	}
	@Override
	public void trackOrder(int orderid) {
		
		if(this.orderid==orderid) {
			System.out.println("Swiggy Order Status is "+status);
		
	}
	
	}
}
