package arrays;

//Write Java program to find smalest umber in an Array, that is divisible by3.

import java.util.Scanner;

public class SmalestElementDevisibleBy3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array lenght:");
		int num = sc.nextInt();
		int min = 0;
		int minNow = Integer.MAX_VALUE;

		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}

		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element" + (i + 1));
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				min = array[i];
				if (min < minNow) {
					minNow = min;
				} else {
					continue;
				}
			}
		}

		if (minNow == Integer.MAX_VALUE) {
			System.out.println("Nqma chislo kratno na 3");
		} else {
			System.out.println(minNow);
		}
		

	}

}
