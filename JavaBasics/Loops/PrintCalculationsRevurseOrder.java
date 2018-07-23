package loop;

//Write program that takes number from the user between 10 and 99.  
//Print out all numbers in reverse order from input number to 0 according following conditions: 
//1) if privies number is even, print – 0,5 * number; 2) if privies number is odd , print – 3*number + 1;
//Printing stops when you reach number 1.
//Expected Output : 11; Result: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

import java.util.Scanner;

public class PrintCalculationsRevurseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firs number:");
		int num = sc.nextInt();
		int calculation = 0;

		for (int i = num; i > 0; i--) {
			if (num % 2 != 0) {
				calculation = ((num * 3) + 1);
				System.out.print(calculation + " ");
				num = calculation;
			} else {
				calculation = num * (1 / 2);
				System.out.print(calculation + " ");
				num = calculation;
			} 
			if (calculation == 1) {
				break;
			}

		}
		// }

	}

}
