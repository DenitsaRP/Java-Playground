package loop;

import java.util.Scanner;

public class Zad16w3 {

	public static void main(String[] args) {

//16. Write a program in Java to display the pattern like right angle triangle with a number.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numer for triangle patern");
		int num = sc.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
