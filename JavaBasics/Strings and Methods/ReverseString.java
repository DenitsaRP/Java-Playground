package stringsMethods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String word = "welcome to ecommera";

		String[] splitWord = word.split(" ");
	
		for (int i = splitWord.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				String wordToReverse = splitWord[i];
				for (int j = wordToReverse.length() - 1; j >= 0; j--) {
					System.out.print(wordToReverse.charAt(j));
				}
				System.out.print(" ");
				continue;
			} else {
				System.out.print(splitWord[i]);
			}
			System.out.print(" ");
		}
	}

}
