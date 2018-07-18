package stringsMethods;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num < 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		printArray(array);

	}

	static void printArray(int[] array) {
		System.out.println("The array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
		}
	}

}
