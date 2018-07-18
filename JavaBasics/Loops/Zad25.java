package loop;

import java.util.Scanner;

public class Zad25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = 1;
		int fakt = 0;
		
		do {
			fakt = num*(num-1);
			sum = sum*fakt ;
			num -=2;
		} while (num > 1 );
		System.out.println(sum);
		
		Scanner sc1 = new Scanner (System.in);
		System.out.println("Enter number");
		int num1 = sc1.nextInt();
		int fakt1 = 1;
		int multi  = 1;
		
		do {
			fakt1 = fakt1 * multi;
			multi++;
			num1--;
		} while (num1 > 0);
		
		System.out.println(fakt1);
	}

}
