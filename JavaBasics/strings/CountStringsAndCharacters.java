package strings;

import java.util.Scanner;

//Write a program that reads a set of words separated by a space.
//As a result to show the number of entered words and number of characters in the longest word.

public class CountStringsAndCharacters {

	public static void main(String[] args) {

		System.out.println("Enter your text: ");
		String text = enterWord();

		splitText(text);

	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}

	static void splitText(String input) {
		int count = 0;
		int length = 0;
		String theLongestWord = new String();
		int alphabets = 0;
		String[] words = input.split(" ");
		for (String word : words) {
			count++;
			if (length < word.length()) {
				length = word.length();
				theLongestWord = word;
			}
		}

		System.out.println("The words are: " + count);
		System.out.println("The longest word have " + lettersCount(theLongestWord) + " letters.");
	}

	static int lettersCount(String input) {
		String word = input;
		int letters = word.length();
		return letters;
	}
}
