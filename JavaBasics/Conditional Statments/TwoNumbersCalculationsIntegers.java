package ifElseStatment;

import java.util.Scanner;

public class TwoNumbersCalculationsIntegers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The sum is: " + sum);
		
		int sub = num1 - num2;
		System.out.println("The Subtraction is: " + sub);
		
		int mul = num1*num2;
		System.out.println("The muliplication is: " + mul);
		
		int div = num1/num2;
		System.out.println("The devision is: " + div);
		
		int intDev = num1%num2;
		System.out.println("The integer devision is: " + intDev );
	}

}
