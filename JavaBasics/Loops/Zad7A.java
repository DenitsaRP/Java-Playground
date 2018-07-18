package loop;

import java.util.Scanner;

public class Zad7A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter times:");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				count = count + 1;
				if (count == num) {
					break;
				}
			}
		}
	}
}
