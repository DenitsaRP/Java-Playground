package stringsMethods;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		
		System.out.println("Enter firt word: ");
		String word = enterWord();
		
		System.out.println("Enter second word: ");
		String word2 = enterWord();
		
		String newWord;
		if (word2.length() < word.length()) {
			newWord = concatenate(word, word2);
		} else {
			newWord = concatenate(word2, word2);
		}
		
		System.out.println("The new word is: ");
		System.out.println(newWord);
	}
	
	static String enterWord( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word from 10 to 20 alphabets: ");
		String word = sc.nextLine();
		while ( word.length() < 10 && word.length() > 20 ) {
			System.out.println("Please, enter word from 10 to 20 alphabets: ");
		}
		return word;
	}
	
	static String concatenate(String word, String word2) {
		String firstPart = word2.substring(0, 5);
		String seconPart = word.substring(5, word.length());
		String result = firstPart + seconPart;
		return result;
	}
}
