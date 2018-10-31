package strings;

import java.util.Scanner;
//Write Java program to count vowels and consonants in String

public class CountVowelsInAndConsonantsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String vow = sc.nextLine();
		String vowLow = vow.toLowerCase();
		char[] arrayVow = vowLow.toCharArray();
		int countVow = 0;
		int countCons = 0;
		for (char ch: arrayVow) {
			if(Character.isLetter(ch)) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'y' || ch == 'q') {
					countVow++;
				} else {
					countCons++;
				}
			}
		}
		System.out.println("vowels = " + countVow);
		System.out.println("consonants = " + countCons);
	}

}
