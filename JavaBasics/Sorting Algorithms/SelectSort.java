package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 7, 2, 8, 2, 5, 1, 9, 0, 7 };
		System.out.println("Sorting array with " + arr.length + " numbers");
		selectSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selectSort(int[] array) {
		for (int k = 0; k < array.length/2; k++) {
			int min = array[k];
			int max = array[k];

			int minIndex = k;
			int maxIndex = k;

			for (int i = k + 1; i < array.length - k - 1; i++) {
				if (min > array[i]) {
					min = array[i];
					minIndex = i;
				}
				if(max <= array[i]) {
					max = array[i];
					maxIndex = i;
				}
			}
			int temp = array[k];
			array[k] = array[minIndex];
			array[minIndex] = temp;

			int temp2 = array[array.length - 1 - k];
			array[array.length - 1 - k] = array[maxIndex];
			array[maxIndex] = temp2;

		}
	}
}
