package array;

import java.util.Scanner;

//Enter an array of 20 elements, integers. Print the largest element in the array.

public class LargestArrayElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("The array is with 20 elements");
		
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter element " + (i + 1));
			array[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The max element is " + max);
	}

}
