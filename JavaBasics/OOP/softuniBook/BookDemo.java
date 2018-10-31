package oop.softuniBook;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		Book book = new Book("Jane Austen", "Pride and Prejudice", 15);
		System.out.println(book);
		System.out.println();
		GoldenEditionBook goldenBook = new GoldenEditionBook("Jane Austen", "Sense and Sensibility", 15.3);
		System.out.println(goldenBook);
		
		System.out.println();
		System.out.println("Enter book's author");
		String author = sc.nextLine();
		System.out.println("Enter book's title");
		String title = sc.nextLine();
		System.out.println("Ente book's price");
		double price = sc.nextDouble();
		
		
		Book kniga = new Book(author, title, price);
		System.out.println(kniga);
	}
}
