package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayWithCollections {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array length: ");
		int arrayLength = sc.nextInt();
		while (arrayLength < 0) {
			System.out.println("Please enter positive number for array length:");
			arrayLength = sc.nextInt();
		}
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please, enter element " + (i + 1));
			array[i] = sc.nextInt();
		}
		System.out.println("The original array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		Collections.reverse(Arrays.asList(array));
		System.out.println("Modified Array : " + Arrays.toString(array));

	}

}
