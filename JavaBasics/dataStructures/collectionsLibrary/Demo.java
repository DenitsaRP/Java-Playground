package dataStructures.collectionsLibrary;

public class Demo {

	public static void main(String[] args) {

		Library library = new Library("Library");

		Book book1 = new Book("Java for everyone", "Krasimir Stoev and Nikolay Tomitov");
		Book book2 = new Book("Thinking in Java", "Bruce Eckel");
		Book book3 = new Book("Pride and prejudice", "Jane Austen");
		Book book4 = new Book("East of Eden", "John Steinbeck");
		Book book5 = new Book("Poems", "Valery Petrov");

		library.addBook("Computer Since", book1);
		library.addBook("Computer Since", book2);
		library.addBook("Classic novels", book3);
		library.addBook("Classic novels", book4);
		library.addBook("Bulgarian poetry", book5);

		Reader gosho = new Reader("Gosho");
		Reader ani = new Reader("Ani");
		library.printLibrary();

		library.rentBook(gosho, book1);
		library.rentBook(ani, book1);
		System.out.println();
		library.printReaderInfo();
		System.out.println();
		library.printLibrary();

	}

}
