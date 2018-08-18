package stringsMethods;

import java.util.Scanner;

//Write a program that enters 2 strings.
//If there is same character in both words, print on screen the first one horizontally and the second vertically, so that they coincide with the common character.


public class CommonCaracterInStrings {

	public static void main(String[] args) {

		System.out.println("Enter first word: ");
		String word1 = enterWord();

		System.out.println("Enter second word: ");
		String word2 = enterWord();

		printWord(word1, word2);

	}

	static String enterWord() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		while (text.contains(" ")) {
			System.out.println("Please, enter word without intervals: ");
			text = sc.nextLine();
		}
		return text;
	}

	static char findMachCharacter(String word1, String word2) {
		char leter = 0;
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					leter = word1.charAt(i);
					break;
				}
			}
			if (leter != 0) {
				break;
			}
		}
		return leter;
	}

	static void printWord(String word1, String word2) {
		char machLetter = findMachCharacter(word1, word2);
		int indexWord1 = word1.indexOf(machLetter);
		int indexWord2 = word2.indexOf(machLetter);

		char[][] matrixWord = new char[word2.length()][word1.length()];
		for (int i = 0; i < matrixWord.length; i++) {
			for (int j = 0; j < matrixWord.length; j++) {
				if (i == indexWord1 && j == indexWord2) {
					matrixWord[i][j] = machLetter;
				} else if (j == indexWord2) {
					matrixWord[i][j] = word1.charAt(i);
				} else if (i == indexWord1) {
					matrixWord[i][j] = word2.charAt(j);
				} else {
					matrixWord[i][j] = ' ';
				}
			}
		}
		for (int i = 0; i < matrixWord.length; i++) {
			for (int j = 0; j < matrixWord.length; j++) {
				System.out.print(matrixWord[i][j]);
			}
			System.out.println();
		}

	}
}
