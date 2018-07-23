package loop;

// Write program, that prints all natural numbers between 100 and 1000, with different digits.

import java.util.Scanner;

public class PrintNymbersWithDifferentDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dig1 = 0;
		int dig2 = 0;
		int dig3 = 0;

		for (int i = 102; i < 1000; i++) {
			dig1 = (i / 100) % 10;
			dig2 = (i / 10) % 10;
			dig3 = i % 10;
			if (dig1 != dig2 && dig1 != dig3) {
				if (dig2 != dig3) {
					System.out.print(i + " ");
				}
			} else {
				continue;

			}
		}

	}

}
