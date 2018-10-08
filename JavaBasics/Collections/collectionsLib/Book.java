package collectionsLib;

public class Book {
	
	private String name;
	private String genre;
	private Person author;
	
	public Book() {
		
	}
	
	public Book(String name, String genre, Person author) {
		this.name = name;
		this.genre = genre;
		this.author = author;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return genre;
	}
	
	public void setDescription(String description) {
		this.genre = description;
	}
	
	public Person getAuthor() {
		return author;
	}
	
	public void setAuthor(Person author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.genre + " " + this.getAuthor().toString();
	}

}
