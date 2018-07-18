package stringsMethods;

import java.util.Scanner;

public class Zad10 {

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
