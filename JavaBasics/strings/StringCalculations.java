package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
// - The code of each vowel multiplied by the string length
// - The code of each consonant divided by the string length
//Sort the number sequence in ascending order and print it on the console. On first line, you will always receive the number of strings you have to read.

public class StringCalculations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many words you want to enter?");
		int num = sc.nextInt();
		sc.nextLine();

		String[] words = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter word ");
			words[i] = sc.nextLine();
		}

		List<Integer> list = new ArrayList<Integer>();

		for (String word : words) {
			int sum = 0;
			char[] charArray = word.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if (checkVowel(charArray[i])) {
					sum += ((int) charArray[i] * charArray.length);
				} else {
					sum += ((int) charArray[i] / charArray.length);
				}
			}
			list.add(sum);
		}
		
		Collections.sort(list);
		System.out.println("The sorted collection is:");
		for(Integer numb: list) {
			System.out.println(numb);
		}

	}

	public static boolean checkVowel(char ch) {
		boolean containsVpwel = false;
		final char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' };
		for (int i = 0; i < vowels.length; i++) {
			if (vowels[i] == ch) {
				containsVpwel = true;
			}
		}
		return containsVpwel;
	}

}
