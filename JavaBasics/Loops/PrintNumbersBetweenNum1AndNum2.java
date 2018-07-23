package loop;

//  Enter 2 numbers from keyboard. Print numbers between those entered numbers. 

import java.util.Scanner;

public class PrintNumbersBetweenNum1AndNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
