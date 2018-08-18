package stringsMethods;

import java.util.Arrays;

public class SwapArrayElements {

	public static void main(String[] args) {

	int[] array = {1, 6};
	
	System.out.println(Arrays.toString(array));
	//swap
	swap(array);
	System.out.println(Arrays.toString(array));
	}
	
	static void swap (int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
}
