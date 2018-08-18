package ifElseStatment;

//Write a Java program that accepts three-digit number and check:

// if a = b = c – digits are equal;  if a > b > c  - digits are in increasing order;
// if a < b < c – digits are in decreasing order;  None of the cases

import java.util.Scanner;

public class CompareNaturalNumberDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter 3 digits nmber:");
		int numb = sc.nextInt();

		int dig1 = (numb / 100) % 10;
		int dig2 = (numb / 10) % 10;
		int dig3 = numb % 10;

		if (dig1 < dig2 && dig2 < dig3) {
			System.out.println("Increasing order");
		} else if (dig1 > dig2 && dig2 > dig3) {
			System.out.println("Decreasing order");
		} else if (dig1 == dig2 && dig2 == dig3) {
			System.out.println("Equal");
		} else {
			System.out.println("Nonå of the cases");
		}
	}

}
