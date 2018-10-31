package strings;

import java.util.Scanner;

public class NumberToStringFromArray {

	// Complete the following program which takes input as a number and converts it
	// into string format.Initially arrays of string are given just use it for your
	// logic. Scenario will be: Enter the number: 54; Entered number is:fifty four

	public static void main(String[] args) {
		String ones[] = { "one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
		String tens[] = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println("Entered number is:");
		if (num < 20) {
			System.out.println(ones[num - 1]);
		} else if (num == 20) {
			System.out.println(tens[0]);
		} else {
			System.out.print(tens[((num / 10) % 10) - 2] + " ");
			System.out.print(ones[(num % 10) - 1]);
		}

	}
}
