package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 3, 6, 1, 9, 2, 5, 7, 4, 8 };
		System.out.println("Sorting array with " + arr.length + " numbers");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void bubbleSort(int[] array) {
		int counter = 0;
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array.length - 1 - k; i++) {
				counter++;
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println("needed " + counter + " operations");
	}
}
