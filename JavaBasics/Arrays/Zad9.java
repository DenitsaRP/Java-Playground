package array;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}

		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
		}

		int arrayNew[] = new int[array.length];
//		arrayNew[0] = array[array.length - 1];
		
		for (int i = 0; i < arrayNew.length; i++) {
			arrayNew[i] = array[(array.length - 1) - i];
			System.out.print(arrayNew[i] + " ");
		}

	}

}
