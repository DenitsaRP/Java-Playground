package loop;

import java.util.Scanner;

public class Zad5B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			int i = num1;
			do {
				System.out.print(i + " ");
				i++;
			}
			
			while (i <= num2) ;
		} else {
			int i = num2;
			do {
				System.out.print(i + " ");
				i++;
			}
			while (i <= num1) ;

		}
	}
}
