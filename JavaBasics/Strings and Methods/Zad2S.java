package stringsMethods;

import java.util.Scanner;

public class Zad2S {

	public static void main(String[] args) {

		System.out.println("Enter first word from 10 to 20 alphabets: ");
		String word = enterWord();

		System.out.println("Enter second word:");
		String word2 = enterWord();

		char[] newWord;
		if (word.length() > word2.length()) {
			newWord = returnWord(word, word2);
		} else {
			newWord = returnWord(word2, word);
		}

		String finalWord = new String(newWord);
		System.out.println(finalWord);
	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		while (word.length() < 10 && word.length() > 20) {
			System.out.println("Please, enter word from 10 to 20 alphabets!");
			word = sc.nextLine();
		}
		return word;
	}

	static char[] returnWord(String word1, String word2) {
		char[] array = new char[word1.length()];
		for ( int i = 0; i < 6; i++) {
			array[i] = word2.charAt(i);
		}
		for ( int i = 6; i < array.length; i++) {
			array[i] = word1.charAt(i);
		}
		return array;
	}

}
