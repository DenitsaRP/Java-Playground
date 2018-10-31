package strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to check if its palindrome:");
		String str = sc.nextLine();  
		String str1 = str.trim();
		boolean palindrome = true;
		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.charAt(i) != str1.charAt((str1.length() - 1 - i))) {
				palindrome = false;
			}
		}
		System.out.println(palindrome ? "Palindrome" : "Not a palindrome");
	}

}
