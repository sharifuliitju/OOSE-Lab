package iit.oop.association;

import java.util.ArrayList;
import java.util.List;

public class Composition_Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		 Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		 Book b3 = new Book("Java: The Complete Reference",  "Herbert Schildt");
		 
		 List<Book> books = new ArrayList<Book>(); // array fixed; arrayList can modify
		 
	     books.add(b1);
	     books.add(b2);
	     books.add(b3);
	 
	     Library library = new Library(books);
	     
	     List<Book> bookList2 = library.getTotalBooksInLibrary();
	     
	     for(Book book: bookList2) {
	    	 System.out.println(book.title + "  " + book.author);
	     }

	}

}
