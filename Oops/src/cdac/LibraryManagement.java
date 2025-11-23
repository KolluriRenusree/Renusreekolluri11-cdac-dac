package cdac;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[]libray=new Book[2];
		libray[0]=new Book(101,"java","james");
		libray[1]=new Book(102,"C","Dennis");
		System.out.println("Books Added Successfully!...");
		
		System.out.println("Show all books in the library...");
		for(int i=0;i<libray.length;i++) {
			libray[i].displayinfo();
		}
		System.out.println("Book issuing with id ....");
		libray[0].isissued();
		System.out.println("Tryinging to issuing the same book again ....");
		libray[0].isissued();
       System.out.println("Returning with id...");
       libray[0].returnBook();
       System.out.println("Books after issue or return..");
       for(int i=0;i<libray.length;i++) {
    	   libray[libray.length-1].displayinfo();
       }
       
	}

}
