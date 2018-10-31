package loops;

//Write a program in Java that calculates the sum of all numbers from 1 to num, where 
// num is entered from the keyboard.

import java.util.Scanner;

public class SumFrom1ToNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int numb = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= numb; i++) {
			
			sum = sum + i;
		}
		System.out.println("The sum is: " + sum);

	}

}
