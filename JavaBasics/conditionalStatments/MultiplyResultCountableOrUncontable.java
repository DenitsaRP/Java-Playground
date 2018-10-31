package conditionalStatments;

// Write Java program that accepts 2 natural numbers from keyboard between 10 and 99.
// Multiply input numbers and print it as result. Also print what type is 
// last digit of multiplication - countable or uncountable

import java.util.Scanner;

public class MultiplyResultCountableOrUncontable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two digits number between 10 and 99");
		int num1 = sc.nextInt();

		System.out.println("Enter second two digits number between 10 and 99");
		int num2 = sc.nextInt();

		int mul = num1 * num2;
		int lastDigit = mul % 10;
		if (lastDigit % 2 == 0) {
			System.out.println("The last digit is " + lastDigit + " - countable");
		} else {
			System.out.println("The last digit is " + lastDigit + " - uncountable");
		}

	}

}
