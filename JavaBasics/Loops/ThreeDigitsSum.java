package loops;

//Write program that prints all three - digit natural numbers, which gigit sum is 
//entered by user and it is between 2 >= sum <= 27. 

import java.util.Scanner;

public class ThreeDigitsSum {
+
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter sum:");
			num = sc.nextInt();			
		} while (!(1 < num && num <= 27));

		int dig1 = 0;
		int dig2 = 0;
		int dig3 = 0;
		int sum = 0;

		for (int i = 101; i < 1000; i++) {
			dig1 = (i / 100) % 10;
			dig2 = (i / 10) % 10;
			dig3 = i % 10;
			sum = dig1 + dig2 + dig3;
			if (sum == num ) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}
	}

}
