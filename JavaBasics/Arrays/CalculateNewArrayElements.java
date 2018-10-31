package arrays;

import java.util.Scanner;

//Write a program that previously entered 10 real numbers of the interval shall be processed as follows:
//1. Prints existing numbers. 2. All items with a value less than -0.231 are replaced by the sum of the square
//of their array index + the number 41.25, and all other elements are replaced by the product between the element
// and his array index. The array index of the first element is 1.
//3. Print on screen the initial input array and the newly formed array.

public class CalculateNewArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}
		double[] array = new double[num];
		double[] newArray = new double[array.length];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter elemnt " + (i + 1));
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] < -0.231) {
				newArray[i] = (((i + 1) * (i + 1)) + 41.25);
			} else {
				newArray[i] = array[i] * (i + 1);
			}
		}
		System.out.println("The firt array is:");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");
		}
		System.out.println();
		System.out.println("The new array is:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(newArray[i] + " , ");
		}
	}

}
