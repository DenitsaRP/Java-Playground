package loops;

//Write Java program that checks whether the input number(entered by user) 
//is prime or not. The program then displays the result.
//The number which is only divisible by itself and 1 is known as prime number


import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		int count = 0;
		boolean isPrime = true;
			
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Not a prime number");
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime number");
		}
	}

}
