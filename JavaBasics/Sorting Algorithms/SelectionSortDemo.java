package sort;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] array = { 40, 6, 82, 12, 41, 41, 59, -32, 61 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

	static void selectionSort(int[] num) {
		for (int k = 1; k < num.length; k++) {
			int maxIndex = 0;
			for (int i = 0; i <= num.length - k; i++) {
				if (num[i] > num[maxIndex]) {
					maxIndex = i;
				}
			}
			int temp = num[maxIndex];
			num[maxIndex] = num[num.length - k];
			num[num.length - k] = temp;
		}
	}

}
