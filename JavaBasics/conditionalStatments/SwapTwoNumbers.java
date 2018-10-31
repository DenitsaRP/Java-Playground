package conditionalStatments;

import java.util.Scanner;

// Enter two numers from the console and swap their values.
// Print the new valus. 

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("Now first number is: " + num1 + " and second is: " + num2);
	}

}
