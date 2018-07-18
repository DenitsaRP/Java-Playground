package loop;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int numb = sc.nextInt();

		for (int i = numb - 1, x = 1;  x <= numb; i+=2, x++) {
			for (int j = 1; j <= numb; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
