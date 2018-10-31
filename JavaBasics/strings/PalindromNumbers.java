package strings;

import java.util.Scanner;

public class PalindromNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your palindrom: ");
		String word = sc.nextLine();
		
		int begin = 0;
		int end = word.length() - 1;
		int middle = end /2;
		boolean palindrom = true;
		
		for(int i = begin; i <= middle; i++) {
			if( word.charAt(i) == word.charAt(end - i)) {
				continue;
			} else {
				palindrom = false;
				break;
			}
		}
		
		if(palindrom) {
			System.out.println("The wordis palindrom");
		} else {
			System.out.println("The word is not a palindrom");
		}
		
		
	}

}
