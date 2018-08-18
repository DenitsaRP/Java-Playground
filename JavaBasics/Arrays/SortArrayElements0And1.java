package array2D;

import java.util.Scanner;

//Write a program that sorts the elements of the array in ascending order. 
//Ålements of the array should be only 0 and 1.

public class SortArrayElements0And1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}

		int[] array = new int[num];
		System.out.println("Enter only 0 or 1 value for the elements of array ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] > 1) {
				System.out.println("Please, enter 1 or 0");
				array[i] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (i < count) {
				array[i] = 0;
			} else {
				array[i] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
