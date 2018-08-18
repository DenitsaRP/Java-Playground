package stringsMethods;

import java.util.Scanner;

//Write a program where user enters from the keyboard two string of symbols without spaces.
//Compare those strings and print on the screen position on which two strings are differ.

public class CompareTwoStringsPrintDifferentPositionVerson2 {

	public static void main(String[] args) {
		
		System.out.println("Enter first word without interval: ");
		String word = enterWord();
		
		System.out.println("Enter second word: ");
		String word2 = enterWord();
		
		String longWord = longesWord(word, word2);
		String shortWord = smallerWord(word, word2);
		
		char[] longWordInArray = fillWords(longWord);
		char[] shortWordInArray = fillWords(shortWord);
				
		for ( int i = 0; i < shortWordInArray.length; i++) {
			if (longWordInArray[i] != shortWordInArray[i]) {
				System.out.println(i + "  " + longWordInArray[i] + " - " + shortWordInArray[i]);
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
	
	static char[] fillWords(String word1) {
		char[] array = new char[word1.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = word1.charAt(i);
		}
		return array;
	}
	
}
