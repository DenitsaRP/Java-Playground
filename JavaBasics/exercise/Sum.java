package exercise;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 
	System.out.println("Enter first number:");
	double numOne = sc.nextDouble();
	System.out.println("Enter second number: ");
	double numTwo = sc.nextDouble();
	System.out.println("Enter third number: ");
	double numThree = sc.nextDouble();
	
	boolean result = ((numOne + numTwo) == numThree);
	System.out.println("Sum is: " + result );
	}

}
