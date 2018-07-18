package ifElseStatment;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Eneter 3 digits nmber:");
		int numb = sc.nextInt();
		
		int dig1 = ( numb/100 )%10;
		int dig2 = ( numb/10 )%10;
		int dig3 =  numb%10;
		
		if (dig1 < dig2 && dig2 < dig3) {
			System.out.println("Vyzhodqsht red");
		} else if (dig1 > dig2 && dig2 > dig3) {
			System.out.println("Nizhodqsht red");
		} else if (dig1 == dig2 && dig2 == dig3 ) {
			System.out.println("Ravni");
		}
	}

}
