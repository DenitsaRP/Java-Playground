package loop;

import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firs number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
//				if (i == num1 && j == num2) {
//					System.out.println(i + "*" + j + "= " + i * j);
//					if (j == num1 && i == num2) {						
//						System.out.println(i + "*" + j + "= " + i * j);
//					}
//				} else {
//					continue;
//				}

			}
		}

	}

}
