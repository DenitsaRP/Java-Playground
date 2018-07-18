package stringsMethods;

import java.util.Scanner;

public class Zad5 {
	public static void name(String[] args) {
		
		System.out.println("Enter first word: ");
		String word1 = enterWord();
		System.out.println(word1);
	}
	
	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		while (! text.contains("[a-zA-Z]")) {
			System.out.println("Please, enter word without intervals and special simvols:");
			text = sc.nextLine();
		}
		return text;
	}
}
