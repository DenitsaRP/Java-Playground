package conditionalStatments;

//Write a Java program to get three numbers from the user and print
//them in descending order.

import java.util.Scanner;

public class ThreeNumbersDescendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();

		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println("Numbers in decreasing order: " + num3 + " , " + num2 + " and " + num1);
			} else if (num2 > num3) {
				System.out.println("Numbers in decreasing order: " + num2 + " , " + num3 + " and " + num1);
			}
		}
		if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println("Numbers in decreasing order: " + num3 + " , " + num1 + " and " + num2);
			} else if (num1 > num3) {
				System.out.println("Numbers in decreasing order: " + num1 + " , " + num3 + " and " + num2);
			}
		}
		if (num3 < num1 && num3 < num2) {
			if (num1 < num2) {
				System.out.println("Numbers in decreasing order: " + num2 + " , " + num1 + " and " + num3);
			} else if (num1 > num2) {
				System.out.println("Numbers in decreasing order: " + num1 + " , " + num2 + " and " + num3);
			}
		}
	}
}
