package dataStructures.collectionsLib;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		
		Library lib = new Library("Asd");
		
		Book b = new Book("name1", "genre1", new Person("pesho"));
		Book a = new Book("name2", "genre2", new Person("Gosho"));
		Book c = new Book("name3", "genre3", new Person("Tosho"));
		
		lib.addBook(new Book("name", "genre", new Person("gosho")));
		lib.addBook(b);
		
		lib.listAllAvailableBooks();
		
		System.out.println();
		lib.removeBook(b);
		
		lib.addBook(a);
		lib.addBook(c);
		lib.listAllAvailableBooks();
	
		Person simo = new Person("Simo");
		lib.rentBook(simo, c);
		System.out.println();
		lib.listAllAvailableBooks();
		

	}

}
