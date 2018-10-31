package strings;

import java.util.Scanner;

//Write a program that returns a string from a string, entered from the user.
//The character of the new string are made by adding the number 5 to each ASCII symbol code.

public class NewASCIIStringFromAdding5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String text = sc.nextLine();

		char[] array = new char[text.length()];
		for (int i = 0; i < array.length; i++) {
			int fillWord = (int) text.charAt(i);
			fillWord += 5;
			array[i] = (char) fillWord;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
