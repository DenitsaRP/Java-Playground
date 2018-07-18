package ifElseStatment;

import java.util.Scanner;

public class Zad2A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		double num2 = sc.nextInt();
		
		double sum = num1 + num2;
		System.out.println("The sum is: " + sum);
		
		double sub = num1 - num2;
		System.out.println("The Subtraction is: " + sub);
		
		double mul = num1*num2;
		System.out.println("The muliplication is: " + mul);
		
		double div = num1/num2;
		System.out.println("The dvision is: " + div);
		
		double intDev = num1%num2;
		System.out.println("The integer devision is: " + intDev );
	}

}
