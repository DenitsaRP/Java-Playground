package loop;

import java.util.Scanner;

public class Zad5A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			int i = num1;
			while (i <= num2) {
				System.out.print(i + " ");
				i++;
			}
		} else {
			int i = num2;
			while (i <= num1) {
				System.out.print(i + " ");
				i++;
			}

		}
	}
}
