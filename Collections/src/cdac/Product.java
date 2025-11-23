package cdac;

public class Product {
	int pid;
	String name;
	double price;
	int qty;
	public Product(int pid, String name, double price, int qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
