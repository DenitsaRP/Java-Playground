package array;

//Write program that takes array length and elements from user. Create new array with length equal 
//to the first one. First and last element of the new array are equal to original array.
//Each element of the new array is sum of previous and next element of the original array.
//Print new array.

import java.util.Scanner;

public class ElementsSumOfOriginalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}

		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eter element " + (i + 1));
			array[i] = sc.nextInt();
		}

		int arrayNew[] = new int[array.length];
		arrayNew[0] = array[0];
		arrayNew[array.length - 1] = array[array.length - 1];
		for (int i = 1; i < arrayNew.length - 1; i++) {
			arrayNew[i] = array[i-1] + array[i+1];
		}
		for (int i = 0; i < arrayNew.length; i++) {
			System.out.print(arrayNew[i] + " ");
		}

	}

}
