package cdac;

import java.util.Scanner;

public class Book {
	int bookid;
	String booktitle;
	String author;
	boolean issued;
	Book(int bookid,String booktitle,String author){
		this.bookid=bookid;
		this.booktitle=booktitle;
		this.author=author;
		this.issued=false;
		
	}
	void isissued() {
		if(!issued) {
			issued=true;
			 System.out.println(booktitle + " is now issued.");
		}
		else {
			 System.out.println(booktitle + " is already issued.");
		}
		
		
		
			
		}
		void returnBook() {
			if(issued) {
				issued=false;
				 System.out.println(booktitle + " is returned.");
			}
			else {
				 System.out.println(booktitle + " is not issued.");
			}
			
			
		}
		void displayinfo() {
			System.out.println("Book id is: "+bookid);
			System.out.println("Book Title is: "+booktitle);
			System.out.println("Book Author is: "+author);
			
		}
		
		
	}


