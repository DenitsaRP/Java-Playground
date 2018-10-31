package loops;

// Starrting from 3, write a Java program to print all numbers between 0 and N,
// which are divisible by 3. N is entered from the keyboard. 

import java.util.Scanner;

public class NumberDivisibleBy3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter times:");
		int num = sc.nextInt();

		for (int i = 3; i <= (num * 3); i += 3) {

			System.out.println(i);
		}

	}
}
