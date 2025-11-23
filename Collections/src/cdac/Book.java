package cdac;

import java.util.Objects;

public class Book {
	int bookid;
	String title;
	String author;
	int price;
	public Book(int bookid, String title, String author, int price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
	
	

}
