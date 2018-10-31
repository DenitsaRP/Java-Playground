package sortingAlgorithms;

import java.util.Arrays;

import org.ietf.jgss.Oid;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 1, 2, 1, 3, 2, 3, 2, 1 };
		System.out.println("Sorting array with " + arr.length + " numbers");
		countSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void countSort(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max <= array[i]) {
				max = array[i];
			}
		}
		int[] helper = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			int indexHelper = array[i];
			helper[indexHelper]++;
		}
		int originalIndex = 0;
		for (int i = 0; i < helper.length; i++) {
			int counter = helper[i];
			for (int j = 0; j < counter; j++) {
				array[originalIndex] = i;
				originalIndex++;
			}
		}
	}
}
