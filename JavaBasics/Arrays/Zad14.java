package array;

import java.util.Scanner;

public class Zad14 {

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
