package strings;

import java.util.Scanner;

//Enter length for Fiboncacci numbers. Which number you want to print from the row.
//Print on screen Fibonacci number on the chosen position.

public class FibonacciNumbersRandom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fibonacci numbers length: ");
		int fibNum = sc.nextInt();
		while (fibNum <= 0) {
			System.out.println("Enter positive number: ");
			fibNum = sc.nextInt();
		}

		System.out.println("Which number do you like to see from Fibonacci nummbers? ");
		int position = sc.nextInt();
		while (position >= fibNum) {
			System.out.println("Enter smaller number than row length!");
			position = sc.nextInt();
		}
		//fbonacciNumbers(fibNum, position);
		System.out.println("The element on the " + position + " is: ");
		System.err.print(fbonacciNumbers(fibNum, position));
		
	}

	static int fbonacciNumbers(int fibNum, int position) {
		int[] array = new int[fibNum];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		int index = array[position];
		return index;
	}
	
	

}
