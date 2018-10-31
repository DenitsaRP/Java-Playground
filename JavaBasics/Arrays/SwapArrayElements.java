package arrays;

//Write Java program with 7 elements. Switch elements according following conditions: 
//Swap elements with index: -  0 and 1, using third variable; 
//- 2 and 3 with sum; - 4 and 5 with multiplication 

import java.util.Scanner;

public class SwapArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter arrey element " + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println("Enter positive number for element " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		int temp = 0;
		temp = array[0];
		array[0] = array[1];
		array[1] = temp;

		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];

		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
