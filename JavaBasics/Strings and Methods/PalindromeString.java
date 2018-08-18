package stringsMethods;

import java.util.Scanner;

//Write a program that reads words from the console.
//The program prints on the screen whether the input string is a palindrome, ie. whether left-to-right and right-to-left are the same.

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Enter word: ");
		String word = enterWord();
		
		palindrom(word);

	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}

	static char[] textToCharArray(String text) {
		char[] array = new char[text.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = text.charAt(i);
		}
		return array;
	}

	static void palindrom(String text) {
		boolean palindrom = false;
		char[] array = textToCharArray(text);
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				if (array[i] == array[array.length - i]) {
					palindrom = true;
				} else {
					break;
				}
			}
		} else {
			for (int i = 0; i < array.length / 2 - 1; i++) {
				if (array[i] == array[array.length - 1 - i]) {
					palindrom = true;
				} else {
					break;
				}
			}
		}
		if(palindrom) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
