package cdac;

public class FoodDeliveryMain {
	public static void main(String[] args) {
		
	
	ZomatoDelivery z=new ZomatoDelivery(101,"Dominos","Preparing");
	SwiggyDelivery s =new SwiggyDelivery(102,"KFC","OrderPacked");
	z.placeOrder("Biryani", 10);
	z.cancelOrder(101);
	z.trackOrder(102);
	s.placeOrder("piza", 2);
	s.cancelOrder(101);
	s.trackOrder(102);
	
	
	
	}
}
