package ifElseStatment;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three digits number:");
		int numb = sc.nextInt();

		int dig1 = (numb / 100) % 10;
		int dig2 = (numb / 10) % 10;
		int dig3 = numb % 10;
		// System.out.println( dig1 +" "+ dig2+" " + dig3);
		int division1 = numb % dig1;
		if (division1 == 0) {
			System.out.println("Number devidet to " + dig1 + " is " + numb / dig1);
		}
		int division2 = numb % dig2;
		if (division2 == 0) {
			System.out.println("Number devidet to " + dig2 + " is " + numb / dig2);
		}
		int division3 = numb % dig3;
		if (division3 == 0) {
			System.out.println("Number devidet to " + dig3 + " is " + numb / dig3);
		}
	}

}
