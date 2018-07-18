package loop;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("Vhisloto NE e prosto");
		} else {
			System.out.println("Chisoto e prosto");
		}
	}

}
