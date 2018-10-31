package oop.softuniBook;

public class Book {

	private String title;
	private String author;
	private double price;
	
	public Book(String author, String title, double price) throws Exception {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) throws Exception {
		if (title.length() < 3) {
			throw new Exception("Title not valid!");
		} else {
			this.title = title;
		}
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) throws Exception {
		for (int i = 0; i < author.length(); i++) {
			char letter = author.charAt(i);
			if (letter == ' ') {
				char nextLetter = author.charAt(i + 1);
				if (!(nextLetter >= '0' && nextLetter <= '9')) {
					this.author = author;
				} else {
					throw new Exception("Author not valid!");
				}
			}
		}

	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) throws Exception {
		if(price < 0) {
			throw new Exception("Price not valid!");
		} else {
			this.price = price;
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("Title: ").append(this.getTitle())
		.append(System.lineSeparator())
		.append("Author: ").append(this.getAuthor())
		.append(System.lineSeparator())
		.append("Price: ").append(this.getPrice()).append("lv.")
		.append(System.lineSeparator());
				return sb.toString();
	}
	
	

}
