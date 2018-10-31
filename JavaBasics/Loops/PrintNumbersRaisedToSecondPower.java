package loops;

// Write Java program, that takes 2 numbers from keyboard A and B.(B greater than A). 
//Print all numbers raised to the second power. If number is divisible by 3,
//print message “skip 3”. If the sum of all numbers, without those divisible by 3,
//is bigger than 200 – stop printing.

import java.util.Scanner;

public class PrintNumbersRaisedToSecondPower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		int count = 0;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			count = i * i;
			
			if (count % 3 == 0) {
				//sum = sum - count;
				System.out.println("skip3");
				continue;

			} else {
				
				System.out.println(count);
			}
			sum = sum + count;
			if (sum > 200) {
				sum = sum - count;
				break;
			}
		}
		System.out.println("Sum " + sum);
	}

}
