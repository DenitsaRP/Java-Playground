package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BookRead {

	public static void main(String[] args) throws IOException {
		File book = new File("book.txt");
		System.out.println("Book length is: " + book.length());
		int commas = 0;
		Scanner sc = new Scanner(book);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (char c : line.toCharArray()) {
				if (c == ',') {
					commas++;
				}
			}
			
		}
		System.out.println("All commas in the book are: " + commas);
		/* Write something in the file:
		PrintWriter printer = new PrintWriter(book);
		printer.println("New text in the book.");
		printer.flush();
		*/
	}

}
