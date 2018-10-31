package conditionalStatments;

// Write program that display a message based on the time of day.
//Dobro utro (04 - 09); Dobur Den (09 - 18); Dobyr vecher ( 18 - 04);

import java.util.Scanner;

public class MessegeBasedOnTime {

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
