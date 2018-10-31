package arrays;

import java.util.Scanner;

//Read an array of 10 elements from the screen - type of numbers -  double, and prints the sum of the elements in the array.

public class SumElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] array = new double[10];
		System.out.println("Eneter arry elements:");
		for (int i = 0; i < array.length; i++) {

			System.out.println("Element " + (i + 1));
			array[i] = sc.nextDouble();
			while (array[i] <= 0) {
				System.out.println("Enter positive number");
				array[i] = sc.nextDouble();
			}
		}
		int sum = 0;
		for ( int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum =  " + sum);
	}

}
