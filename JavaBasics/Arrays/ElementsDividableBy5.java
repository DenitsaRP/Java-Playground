package arrays;

//Write program that takes array with 7 elements from user – only natural numbers. 
//Print all elements dividable by 5 and greater than 5. 

import java.util.Scanner;

public class ElementsDividableBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
			/*
			 * while (array[i] <= 0) { System.out.println("Enter positive element " + (i +
			 * 1)); array[i] = sc.nextInt(); }
			 */}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] != 5)
				System.out.print(array[i] + " ");
		}

	}

}
