package strings;

import java.util.Scanner;

public class StringContainsOnlyDigits {
	//Write Java program to check if String contains only digits
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string with numbers:");
		String digString = sc.nextLine();
		boolean allDigits = true;
		char[] digArray = digString.toCharArray();
		for (char ch : digArray) {
			if (!(Character.isDigit(ch))) {
				allDigits = false;
				break;
			}
		}
		System.out.println(allDigits ? "Only Digits!" : "NOT only Digits");
		System.out.println();
		System.out.println("----------------");
		//2:
		System.out.println((digString.matches("^[0-9]*$"))? "Only Digits" : "NOT only Digits");
	

	}

}
