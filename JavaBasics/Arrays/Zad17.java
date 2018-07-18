package array;

import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}

		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Enter element " + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println(" Enter positive numer for element " + (i + 1));
				array[i] = sc.nextInt();
			}

		}
		boolean zigZag = false;
		for (int i = 1; i < array.length - 1; i += 2) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				zigZag = true;
			} else {
				break;
			}
		}
		if (zigZag) {
			System.out.println("Zigzagoobrazna nagore reditsa");
		} else {
			System.out.println("reditsata ne e zigzagoobrazna");
		}
	}
}
