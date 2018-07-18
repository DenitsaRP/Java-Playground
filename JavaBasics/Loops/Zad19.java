package loop;

import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter firs number:");
		int num = sc.nextInt();
		int calculation = 0;

		for (int i = num; i > 0; i--) {
			if (num % 2 != 0) {
				calculation = ((num * 3) + 1);
				System.out.print(calculation + " ");
				num = calculation;
			} else {
				calculation = num * (1 / 2);
				System.out.print(calculation + " ");
				num = calculation;
			} // for ( int i = calculation; i >0; i-- ) {
			//System.out.print(i + " ");
			if (calculation == 1) {
				break;
			}

		}
		// }

	}

}
