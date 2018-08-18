package array2D;

import java.util.Scanner;

//Write a program that checks whether all the elements are positive integers.

public class ChecksForPositiveElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}
		
		int[] array = new int [num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i+1));
			array[i] = sc.nextInt();
		} 
		
		boolean positiveElement = true;
		for (int i = 0; i < array.length; i++ ) {
			if (array[i] < 0) {
				positiveElement = false;
				break;
			}
		}
		if (positiveElement) {
			System.out.println("All elements are positive in the array");
		} else {
			System.out.println("There is negative element in the array");
		}
	}

}
