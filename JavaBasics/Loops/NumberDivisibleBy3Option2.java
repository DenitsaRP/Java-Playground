package loop;

//Starrting from 3, write a Java program to print all numbers between 0 and N,
//which are divisible by 3. N is entered from the keyboard. 

import java.util.Scanner;

public class NumberDivisibleBy3Option2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter times:");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				count = count + 1;
				if (count == num) {
					break;
				}
			}
		}
	}
}
