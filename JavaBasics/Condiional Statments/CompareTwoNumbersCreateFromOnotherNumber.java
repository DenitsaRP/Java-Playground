package ifElseStatment;
//Write Java program that accepts 4 digit natural number between [1000 and 9999].
// Create 2 new 2 digit numbers - first one is from first and last digit
// the seconnd 2 digit number is from second and third digit from the first entered 4 digit number
// Compare 2 new formed numbers and print on the screen messege if they are equal rr one of them s greater to the other.

import java.util.Scanner;

public class CompareTwoNumbersCreateFromOnotherNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter four digits number between 1000 and 9999");
		int numb = sc.nextInt();

		int dig1 = (numb / 1000) % 10;
		// System.out.println(dig1);
		int dig2 = (numb / 100) % 10;
		// System.out.println(dig2);
		int dig3 = (numb / 10) % 10;
		// System.out.println(dig3);
		int dig4 = numb % 10;
		// System.out.println(dig4);
		if ((dig1 <= dig2) && dig4 < dig3) {

			System.out.println(dig1 + "" + dig4 + " < " + dig2 + "" + dig3);

		} else if (dig1 > dig2 && (dig4 > dig3 || dig4 < dig3)) {

			System.out.println(dig1 + "" + dig4 + " > " + dig2 + "" + dig3);

		} else if (dig1 == dig2 && dig4 == dig3) {

			System.out.println(dig1 + "" + dig4 + " = " + dig2 + "" + dig3);
		}
	}
}
// int num1 = num % 10;
// int num2 = num / 10 % 10;
// int num3 = num /100 % 10;