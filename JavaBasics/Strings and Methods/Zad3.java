package stringsMethods;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		System.out.println("Enter first word without interval: ");
		String word = enterWord();
		
		System.out.println("Enter second word: ");
		String word2 = enterWord();
		
		String longWord = longesWord(word, word2);
		String smallWord = smallerWord(word, word2);
		
		
		char[] array = new char[longWord.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = longWord.charAt(i);
		}
		char[] array2 = new char[smallWord.length()];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = smallWord.charAt(i);
		}
		for ( int i = 0; i < array2.length; i++) {
			if (array[i] != array2[i]) {
				System.out.println(i + "  " + array[i] + " - " + array2[i]);
			}
		}

	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		boolean checkForInterval = word.contains(" ");
		while (checkForInterval) {
			System.out.println("Enter word without interval");
			word = sc.nextLine();
			boolean checkAgain = word.contains(" ");
			if ( !checkAgain ) {
				break;
			}
		}
		return word;
	}
	
	static String longesWord (String word1, String word2) {
		String longestWord = new String();
		if (word1.length() > word2.length()) {
			longestWord = word1;
			System.out.println("The first word is loner");
		} else if (word1.length() < word2.length()) {
			longestWord = word2;
			System.out.println("The second word is longer");
		} else {
			longestWord = word1;
			System.out.println("First word is equal to secon one!");
		}
		return longestWord;
	}
	
	static String smallerWord (String word1, String word2) {
		String smallerWord = new String();
		if (word1.length() > word2.length()) {
			smallerWord = word2;
		} else if (word1.length() < word2.length()) {
			smallerWord = word1;
		} else {
			smallerWord = word2;
		}
		return smallerWord;
	}
	
}
