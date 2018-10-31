package strings;

import java.util.Scanner;
//Write a Java program to print first non repeated character in String
public class PrintFirstNonRepeated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String strRep = sc.nextLine();
		char[] repArray = strRep.toCharArray();
		for (int i = 0; i < repArray.length - 2; i++) {
			if ((repArray[i] != repArray[i + 1]) && (repArray[i + 1] != repArray[i + 2])) {
				System.out.println("First non repeated character: " + repArray[i + 1]);
				break;
			}
		}
	}

}
