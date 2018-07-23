package loop;

//Write program that takes 2 numbers from the user for interval. Numbers have to be between 10 and 5555. 
//Print all numbers from the entered intervals which are divisible by 50.

import java.util.Scanner;

public class PrintNumbersDivisibleBy50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firs number:");		
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");		
		int num2 = sc.nextInt();
		
		for (int i = num2; i > num1; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
