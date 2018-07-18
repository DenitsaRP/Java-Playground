package ifElseStatment;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number:");
		int numb = sc.nextInt();

		if (numb > 0) {
			System.out.println("The number is positive!");
		} else {
			if (numb == 0) {
				System.out.println("The number is zero!");
			} else {
				System.out.println("The number is negative!");
			}
		}
	}
}
