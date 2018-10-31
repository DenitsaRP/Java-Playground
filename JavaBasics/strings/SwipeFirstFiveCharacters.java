package strings;

import java.util.Scanner;

//Write a program where are entered from the keyboard two words between 10-20 characters long .
//The program swaps their first 5 characters and displays the length of the longer word, as well as their new content.

public class SwipeFirstFiveCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first wor with length from 10 to 20 alphabets: ");
		String word = sc.nextLine();
		while (word.length() < 10 && word.length() > 20) {
			System.out.println("Please, try again according to condition!");
			word = sc.nextLine();
		}

		System.out.println("Please, enter the second word with length from 1 to 20 alphabets: ");
		String word2 = sc.nextLine();
		while (word2.length() < 10 && word2.length() > 20) {
			System.out.println("Please, try again according to condition!");
			word2 = sc.nextLine();
		}
		
		char[] newWord;
		if (word.length() > word2.length()) {
			System.out.println(word.length());
			 newWord = new char [word.length()];
			for (int i = 0; i < 5; i++)
			{
				newWord[i] = word2.charAt(i);
			}
			for (int i = 5; i < newWord.length; i++) {
				newWord[i] = word.charAt(i);
			}
					
		} else {
			System.out.println(word2.length());
			newWord = new char[word2.length()];
			for (int i = 0; i < 5; i++)
			{
				newWord[i] = word.charAt(i);
			}
			for (int i = 5; i < newWord.length; i++) {
				newWord[i] = word2.charAt(i);
			}
			
		}
		for (int i = 0; i < newWord.length; i++) {
				System.out.print(newWord[i]);
		}
	
	}

}
