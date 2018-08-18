package ifElseStatment;

import java.util.Scanner;

// Write Java program that enters 3 numbers - integer for hour, double for money,
// boolean type for helath. Print on the screen wwhich case suites entered numbers. 
// -if I'm ill - I'll stay at home; - if I've money, I'll buy some medecine
// - if I've no money, I'l stay home and drink tea; - if I'm healthy, I'll go to the cinema with friends; 
// - if I have less than 10 levs, I'll go out for a coffee

public class HealthMoneyCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter time: ");
		int time = sc.nextInt();

		System.out.println("Enter money: ");
		double money = sc.nextDouble();

		System.out.println("Am I healthy: ");
		boolean healthy = sc.nextBoolean();

		if (!healthy) {
			if (money <= 0) {
				System.out.println("I'm ill and  I'm going to stay at home and drink tea ");
			} else {
				System.out.println("I'm ill and I'm going to buy some medecine! ");
			}
		}
		if (healthy) {
			if (money > 10) {
				System.out.println (" I'll go to the cinema with frinds.");
			} else if ( money > 0 && money <10 ) {
				System.out.println(" I'll go out for a coffee. ");
			} else {
				System.out.println(" You don't have any money... ");
			}
		}
	}

}
