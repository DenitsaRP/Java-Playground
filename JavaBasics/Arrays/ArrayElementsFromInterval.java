package array;

//Write program that takes array length and elements from the user. 
//Print out as result new array with elements in interval between [-2.99 to 2.99] from the first array.

import java.util.Scanner;

public class ArrayElementsFromInterval {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}

		double[] array = new double[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter array elemnet" + (i+1));
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > -2.99 && array[i] < 2.99) {
				System.out.print(array[i] + " ");
			}

		}
	}
}
