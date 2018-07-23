package array;

//Write program that takes two arrays from the user. Print on the screen
//if the arrays are equal and have same length.

import java.util.Scanner;

public class ComapreTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first array length:");
		int num1 = sc.nextInt();
		while (num1 <= 0) {
			System.out.println("Enter positive number:");
			num1 = sc.nextInt();
		}

		System.out.println("Enter second array length:");
		int num2 = sc.nextInt();
		while (num2 <= 0) {
			System.out.println("Enter positive number:");
			num2 = sc.nextInt();
		}

		boolean equal = true;
		if (num1 != num2) {
			equal = false;
		} else {
			int arrayOne[] = new int[num1];
			for (int i = 0; i < arrayOne.length; i++) {
				System.out.println("First array element: " + (i + 1));
				arrayOne[i] = sc.nextInt();
			}
			int arrayTwo[] = new int[num2];
			for (int i = 0; i < arrayTwo.length; i++) {
				System.out.println("Second array element: " + (i + 1));
				arrayTwo[i] = sc.nextInt();
			}

			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equal = false;
					break;
				}
			}
		}

		if (equal) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}

}
