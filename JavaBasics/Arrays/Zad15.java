package array;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}

		double[] array = new double[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Enter element " + (i + 1));
			array[i] = sc.nextDouble();

		}
		double max1 = 0;
		double max2 = 0;
		double max3 = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max1) {
				max2 = max1;
				max1 = array[i];
			}

			if (array[i] > max2 && array[i] != max1) {
				max3 = max2;
				max2 = array[i];
			}
//			if (array[i] > max3 && array[i] != max1) {
//				if (array[i] != max2) {
//					max3 = array[i];
//				}

			}
		System.out.println(max1 + " ");
		System.out.println(max2 + " ");
		System.out.println(max3 + " ");
	}

}