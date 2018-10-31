package loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		//17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter triangular number:");
		int num = sc.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print( i);
			}
			System.out.println();
		}
	}

}
