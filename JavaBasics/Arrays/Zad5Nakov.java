package array;

import java.util.Scanner;

public class Zad5Nakov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number!");
			num = sc.nextInt();
		}

		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter elemen " + (i + 1));
			array[i] = sc.nextInt();
		}

		int count = 1;
		int count2 = 0;
		int temp = array[0];
		int row = 0;
		int firstOfRow = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] - array[i - 1] == 1) {
				count++;
				if (count2 < count) {
					count2 = count;
					temp = array[i - count + 1]; // i = 1 red 28
				}
				if (array[i] == array[array.length - 1] && row < count) {
					row = count;
					firstOfRow = temp;
				}

			} else {
				if (count > row) {
					row = count;
					firstOfRow = temp;
				}
				count = 1;
				count2 = 0;
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == firstOfRow && array[i + 1] - array[i] == 1) {
				while (row > 0) {
					System.out.print(array[i] + " ");
					i++;
					row--;
				}
				break;

			}
		}
		if (row == 1) {
			System.out.print("Nqma narasvashta reditsa ");
		}
	}

}
