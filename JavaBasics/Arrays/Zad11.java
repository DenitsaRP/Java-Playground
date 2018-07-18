package array;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
			/*
			 * while (array[i] <= 0) { System.out.println("Enter positive element " + (i +
			 * 1)); array[i] = sc.nextInt(); }
			 */}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] != 5)
				System.out.print(array[i] + " ");
		}

	}

}
