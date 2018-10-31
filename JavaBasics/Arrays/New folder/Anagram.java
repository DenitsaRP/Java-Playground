package strings;

import java.util.Scanner;
//Write java program to check if two words are anagrams:
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word:");
		String s1 = sc.nextLine();
		System.out.println("Enter second word: ");
		String s2 = sc.nextLine();
		int countAnagram = 0;
		boolean anagrams = true;
		if (s1.length() != s2.length()) {
			anagrams = false;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			for (int k = 0; k < ch1.length; k++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[k] == ch2[j]) {
						countAnagram++;
					}
				}
			}
			if (countAnagram != s1.length()) {
				anagrams = false;
			}
		}
		System.out.println(anagrams ? "Anagrams" : "Not an anagram");
	}

}
