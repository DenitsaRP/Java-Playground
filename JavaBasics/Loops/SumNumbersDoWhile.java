package loop;

//Write Java program, that takes number from the user N, and prints sum between  0 and N.

import java.util.Scanner;

public class SumNumbersDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int x = 1;
		int sum = 0;

		do {
			sum += x;
			x++;
			
		} while (x <= num);
		System.out.println(sum + " ");
	}

}
