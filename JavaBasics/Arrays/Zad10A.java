package array;

import java.util.Scanner;

public class Zad10A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element" + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println("Enter positive number for element: " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		int middel = array[(array.length / 2)];
		int temp = 0;
		int underMiddel = array[0];
		int aboveMiddel = array[6];
		boolean machNumber = false;

		for (int i = 0; i < array.length / 2; i++) {

			if (array[i] == middel) {
				machNumber = true;
				temp = array[i];
			} else {
				if (array[i] < middel && array[i] > underMiddel) {
					underMiddel = array[i];
				} else if (array[i] > middel && array[i] < aboveMiddel) {
					aboveMiddel = array[i];
				}
			}
		}
		for (int i = (array.length - 1); i > array.length / 2; i--) {

			if (array[i] == middel) {
				machNumber = true;
				temp = array[i];
			} else {
				if (array[i] < middel && array[i] > underMiddel) {
					underMiddel = array[i];
				} else if (array[i] > middel && array[i] < aboveMiddel) {
					aboveMiddel = array[i];
				}
			}
		}

		if (machNumber) {
			System.out.println("The middel variable is " + middel);
			System.out.println("The closestvariable to the middel one is: " + temp);
		} else if ((middel - underMiddel) > (aboveMiddel - middel)) {
			System.out.println("The middel variable is " + middel);
			System.out.println("The closestvariable to the middel one is: " + aboveMiddel);
		} else {
			System.out.println("The middel variable is " + middel);
			System.out.println("The closestvariable to the middel one is: " + underMiddel);
		}
	}
}
