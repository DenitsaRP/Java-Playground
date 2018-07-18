package array;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter arrey element " + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println("Enter positive number for element " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		int temp = 0;
		temp = array[0];
		array[0] = array[1];
		array[1] = temp;

		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
