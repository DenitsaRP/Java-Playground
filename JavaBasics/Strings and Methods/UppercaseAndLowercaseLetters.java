package stringsMethods;

import java.util.Scanner;

//Write a program that enters two strings containing up to 40 upper and lower case letters.
//As a result, the screen displayed strings uppercase and only lowercase.

public class UppercaseAndLowercaseLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet uppercase and lowercase: ");
		System.out.println("Please enter less than 40 alphabets!");
		String bukvi = sc.nextLine();
		while (bukvi.length() > 40) {
			System.out.println("Please, enter less than 40 alphabets:");
			bukvi = sc.nextLine();
		}
		
		System.out.println(bukvi.toUpperCase());
		System.out.println(bukvi.toLowerCase());
		
	}

}
