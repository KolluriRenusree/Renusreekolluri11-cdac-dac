package cdac;

public class Book {
	int bid;
	String name;
	String author;
	float price;
	public Book(int bid, String name, String author, float price) {
		super();
		this.bid = bid;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
}
