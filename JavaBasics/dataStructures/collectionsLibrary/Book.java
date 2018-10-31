package dataStructures.collectionsLibrary;

public class Book {

	private String name;
	private String author;
	private int id;
	private static int uniqueId = 1;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.id = uniqueId++;
	}
	
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", id=" + id + "]";
	}

}
