package com.collection.linkedlist;

import java.util.LinkedList;

public class AddBooks {

	int id = 0;
	String title = null;
	String author = null;
	String publisher = null;
	String contry=null;

	public AddBooks(int id, String title, String author, String publisher,String country) {

		this.id = id;
		this.title = title;
		this.author=author;
		this.publisher=publisher;
		this.contry=country;

	}

	public static void main(String[] args) {
             
		
		
		LinkedList<AddBooks> booksDetails=new LinkedList<>();
		
	     AddBooks book1=new AddBooks(101, "The Hobbit", "J. R. R. Tolkien","Houghton Mifflin","USA");
	     AddBooks book2=new AddBooks(102, "Slinky Malinki", "Lynley Dodd","Mallinson Rendel","NZ");
	     
	     
	     
	     
	     booksDetails.add(book1);
	     booksDetails.add(book2);
	     
	     for (AddBooks addBooks : booksDetails) {
	    	    System.out.println(addBooks.id+" "+ addBooks.title + " " + addBooks.author + " " + addBooks.publisher + " " + addBooks.contry );
		}
	     
	     
	 
	}

}
