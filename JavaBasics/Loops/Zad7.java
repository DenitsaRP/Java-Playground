package loop;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter times:");
		int num = sc.nextInt();

		for (int i = 3; i <= (num * 3); i += 3) {

			System.out.println(i);
		}

	}
}
