package ifElseStatment;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			System.out.println("Numbers in increasing order: " + num1 + " and " + num2);
		} else {
			System.out.println("Numbers in increasing order: " + num2 + " and " + num1);
		}
	}

}
