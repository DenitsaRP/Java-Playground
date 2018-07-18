package ifElseStatment;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		
		int num4 = num1;
		num1 = num2;
		num2 = num3;
		num3 = num4;
		
		System.out.println("Now first number is: " + num1 + ", second number is: " + num2
				+ " and the thurd number is: " + num3 );

	}

}
