package ifElseStatment;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number between 0 and 24:");
		int numb = sc.nextInt();
		
		if (numb >= 18 && numb < 4) {
			System.out.println("Dobyr vecher");
		} else if (numb >= 4 && numb < 9) {
			System.out.println("Dobro utro");
		} else if ( numb >= 9 && numb < 18 ) {
			System.out.println("Dobur Den");
		}
		sc.close();
	}

}
