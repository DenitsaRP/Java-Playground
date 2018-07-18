package array;

import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array lenght:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number! ");
			num = sc.nextInt();
		}
		int[] array = new int[num];
		System.out.println("Enter first array elements:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter array1 element " + (i + 1));
			array[i] = sc.nextInt();
		}

		int[] array2 = new int[array.length];
		System.out.println("Eneter second array elements:");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Eneter array2 element " + (i + 1));
			array2[i] = sc.nextInt();
		}
		int[] array3 = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > array2[i]) {
				array3[i] = array[i];
			} else {
				array3[i] = array2[i];
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		//System.out.println();
		System.out.println("Result:");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}

}
