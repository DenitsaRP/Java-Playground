package ifElseStatment;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter four digits number between 1000 and 9999");
		int numb = sc.nextInt();

		int dig1 = (numb / 1000) % 10;
		// System.out.println(dig1);
		int dig2 = (numb / 100) % 10;
		// System.out.println(dig2);
		int dig3 = (numb / 10) % 10;
		// System.out.println(dig3);
		int dig4 = numb % 10;
		// System.out.println(dig4);
		if ((dig1 <= dig2) && dig4 < dig3) {

			System.out.println(dig1 + "" + dig4 + " < " + dig2 + "" + dig3);

		} else if (dig1 > dig2 && (dig4 > dig3 || dig4 < dig3)) {

			System.out.println(dig1 + "" + dig4 + " > " + dig2 + "" + dig3);

		} else if (dig1 == dig2 && dig4 == dig3) {

			System.out.println(dig1 + "" + dig4 + " = " + dig2 + "" + dig3);
		}
	}
}
// int num1 = num % 10;
// int num2 = num / 10 % 10;
// int num3 = num /100 % 10;