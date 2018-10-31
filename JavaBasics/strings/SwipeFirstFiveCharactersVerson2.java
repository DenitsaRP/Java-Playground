package strings;

import java.util.Scanner;

//Write a program where are entered from the keyboard two words between 10-20 characters long .
//The program swaps their first 5 characters and displays the length of the longer word, as well as their new content.

public class SwipeFirstFiveCharactersVerson2 {

	public static void main(String[] args) {

		System.out.println("Enter first wor with length from 10 to 20 alphabets: ");
		String word = enterWord();
		System.out.println("Please, enter the second word with length from 10 to 20 alphabets: ");
		String word2 = enterWord();

		char[] newWord;
		if (word.length() > word2.length()) {
			newWord = createNewWord(word, word2);

		} else {
			newWord = createNewWord(word2, word);
		}

		String finalWord = new String(newWord);
		System.out.println(finalWord);
	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		while (word1.length() < 10 && word1.length() > 20) {
			System.out.println("Please, try again according to condition!");
			word1 = sc.nextLine();
		}
		return word1;
	}

	static char[] createNewWord(String word, String secondWord) {
		System.out.println(word.length());
		char[] array = new char[word.length()];
		for (int i = 0; i < 5; i++) {
			array[i] = secondWord.charAt(i);
		}
		for (int i = 5; i < array.length; i++) {
			array[i] = word.charAt(i);
		}
		return array;
	}

}
