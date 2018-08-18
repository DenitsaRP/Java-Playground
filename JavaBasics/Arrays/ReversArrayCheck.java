package array;

import java.util.Scanner;

//Enter two arrays and check, if the first - inverted is equal to the second one.

public class ReversArrayCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}

		boolean reverse = false;
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println("Entere positive element " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		int[] array2 = new int[array.length];
		System.out.println("Enter array2 elements:");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array2[i] = sc.nextInt();
			while (array2[i] <= 0) {
				System.out.println("Entere positive element " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		for (int i = 0; i < array2.length - 1; i++) {
			if (array2[i] == array[(array.length - 1) - i]) {
				reverse = true;
			} else {
				break;
			}

		}
		// int[] array3 = new int[array.length];
		// for (int i = 0; i <= array3.length - 1; i++) {
		// array3[i] = array[(array.length - 1) - i];
		// }
		// for (int i = 0; i < array3.length; i++) {
		// if (array3[i] == array2[i]) {
		// reverse = true;
		// } else {
		// break;
		// }
		// }
		if (reverse) {
			System.out.println("The array 1 is reverse to array 2");
		} else {
			System.out.println("Not reversed");
		}
	}

}
