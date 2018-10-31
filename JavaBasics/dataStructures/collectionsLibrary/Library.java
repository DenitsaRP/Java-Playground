package dataStructures.collectionsLibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Library {

	private String name;
	private HashMap<String, ArrayList<Book>> libraryCollection = new HashMap<>();// department -> book
	private HashMap<Reader, ArrayList<Book>> readerList = new HashMap<>(); // reader Id-> book

	public Library(String name) {
		libraryCollection = new HashMap<String, ArrayList<Book>>();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Unknown Library";
		}
	}

	public void addBook(String departmentOfLiterature, Book book) {
		if (!libraryCollection.containsKey(departmentOfLiterature)) {
			libraryCollection.put(departmentOfLiterature, new ArrayList<>());
		}
		libraryCollection.get(departmentOfLiterature).add(book);
	}

	public void rentBook(Reader reader, Book book) {
		if (!readerList.containsKey(reader)) {
			readerList.put(reader, new ArrayList<>());
		}
		readerList.get(reader).add(book);
		libraryCollection.remove(book.getName());
	}

	public void printLibrary() {
		for (Entry<String, ArrayList<Book>> b : libraryCollection.entrySet()) {
			System.out.println("=====" + b.getKey() + "=====");
			for (Book libBook : b.getValue()) {
				System.out.println(libBook);
			}
		}
	}

	public void printReaderInfo() {
		for (Entry<Reader, ArrayList<Book>> read : readerList.entrySet()) {
			System.out.println(read.getKey() + "Reads: ");
			for (Book takeBook : read.getValue()) {
				System.out.println(takeBook);
			}
		}
	}

}
