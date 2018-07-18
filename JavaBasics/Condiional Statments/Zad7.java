package ifElseStatment;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println(" Enter time: ");
//		int time = sc.nextInt();

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
