package loops;

//Write program that takes number from the user between 10 and 99.  
//Print out all numbers in reverse order from input number to 0 according following conditions: 
//1) if privies number is even, print – 0,5 * number; 2) if privies number is odd , print – 3*number + 1;
//Printing stops when you reach number 1.
//Expected Output : 11; Result: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.

import java.util.Scanner;

public class PrintCalculationsRevurseOrder1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in );
		System.out.println("Enter firs number:");
		double num = sc.nextDouble();
		double calculation = num;

	
			while (calculation != 1) {
			if (calculation % 2 != 0) {
				calculation = ((calculation * 3) + 1);
				System.out.print(String.format("%.0f", calculation) + " ");
				
			} else {
				calculation = calculation * (0.5);
				System.out.print(String.format("%.0f", calculation) + " ");
				
			}
		
			if (calculation == 1) {
				break;
			}

		}

	}


}
