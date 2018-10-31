package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSortOptimized {

	public static void main(String[] args) {

		int[] array = { 6, 82, 12, 41, 41, 59, -32, 61 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

	static void selectionSort(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		for (int k = 0; k < arr.length / 2; k++) {

			int maxIndex = start;
			int minIndex = start;

			for (int i = start; i <= end; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[end];
			arr[end] = temp;
			if (minIndex == end) {
				minIndex = maxIndex;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[start];
			arr[start] = temp;
			end--;
			start++;
		}

	}
}
