package strings;

import java.util.Scanner;

//Reverse each word in given string:
public class ReverseEachStringInGivenWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text: " );
		String input = sc.nextLine();
		String[] inputArray = input.split("\\s+");
		for (String inputWord : inputArray) {
			for (int i = inputWord.length() - 1; i >= 0; i--) {
				System.out.print(inputWord.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
