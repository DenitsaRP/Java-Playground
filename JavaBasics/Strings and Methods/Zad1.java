package stringsMethods;

import java.util.Scanner;

public class Zad1 {

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
