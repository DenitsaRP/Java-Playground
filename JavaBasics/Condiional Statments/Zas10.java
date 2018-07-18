package ifElseStatment;

import java.util.Scanner;

public class Zas10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter natural number between 10 and 9999");
		int numb = sc.nextInt();
		System.out.println("this is the volume of water than.");
		
		int fill = numb/5;//The total volume of the buckets
		int rest =numb - ( fill*5);
		System.out.println("We will need exactly " + fill + 
				" buckets - 2L and " + fill + " buckets - 3L");
		System.out.println("The rest will be filled with "+  rest + "liters");
	}

}
