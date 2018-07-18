package array;

import java.util.Scanner;

public class Zad16 {

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
