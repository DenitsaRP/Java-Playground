package loop;

//Write program that takes 2 numbers from the user between 1 and 9. Print as result multiplication table only with two entered numbers.
//Expected Output : 2 2 
//1*1= 1; 1*2= 2; 2*1= 2; 2*2= 4;

import java.util.Scanner;

public class MultiplicationTableTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firs number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
		}

	}

}
