package array;

import java.util.Scanner;

//A series of natural numbers will be called zigzag upwards, if the element conditions are fulfilled:
//N1 < N2 > N3 < N4 > N5 <.. Write a program that checks whether entered into a one-dimensional
// array of numbers fulfill the above requirements. Example: 1 3 2 4 3 7
// Exit: The array is zigzagging upwards

public class ZigzagUpwards {

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
			System.out.println("The array is zigzagging upwards");
		} else {
			System.out.println("The array is not zigzagging upwards");
		}
	}

}
