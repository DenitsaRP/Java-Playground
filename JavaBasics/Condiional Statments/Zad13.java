package ifElseStatment;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter degeese in C:");
		int deg = sc.nextInt();

		if (deg <= -20) {
			System.out.println("Ledeno studeno");
		} else if (deg <= 0 && deg > -20) {
			System.out.println("Studeno");
		} else if (deg > 0 && deg <= 15) {
			System.out.println("Hladno");
		} else if (deg > 15 && deg <= 25) {
			System.out.println("Toplo");
		} else if (deg > 25 ) {
			System.out.println("Goreshto");
		}

	}

}
