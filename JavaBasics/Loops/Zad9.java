package loop;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		int count = 0;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			count = i * i;
			
			if (count % 3 == 0) {
				//sum = sum - count;
				System.out.println("skip3");
				continue;

			} else {
				
				System.out.println(count);
			}
			sum = sum + count;
			if (sum > 200) {
				sum = sum - count;
				break;
			}
		}
		System.out.println("Sum " + sum);
	}

}
