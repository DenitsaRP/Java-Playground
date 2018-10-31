package dataStructures.collectionsLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	
	private String name;
	private List<Book> availableBooks;
	private Map<Person, List<Book>> rentedBooks;
	
	public Library(String name) {
		this.name = name;
		this.availableBooks = new ArrayList<>();
		this.rentedBooks = new HashMap<>();
	}
	
	//add book
	public void addBook(Book bookToAdd) {
		this.availableBooks.add(bookToAdd);
	}
	//remove book
	public void removeBook(Book bookToRemove) {
		this.availableBooks.remove(bookToRemove);
	}
	//list available books
	public void listAllAvailableBooks() {
		for (Book book : this.availableBooks) {
			System.out.println(book.toString());
		}
	}
	//rent book
	public void rentBook(Person person, Book book) {
		if(!rentedBooks.containsKey(person)) {
			rentedBooks.put(person, new ArrayList<Book>());
			rentedBooks.get(person).add(book);
		}else {
			if(rentedBooks.get(person).size() < 5) {
				rentedBooks.get(person).add(book);
				availableBooks.remove(book);
			} else {
				System.out.println("Person has too many books");
			}
		}
	}
	//return book
	public void returnBook(Person person, Book book) {
		rentedBooks.get(person).remove(book);
		availableBooks.add(book);
	}
	//list person's rented books
	public void listPersonsBooks(Person person) {
		if(rentedBooks.containsKey(person)) {
			for (Book book : rentedBooks.get(person)) {
				System.out.println(book.toString() + " ");
			}
		} else {
			System.out.println("This person does not existe in the library");
		}
	}
}	
