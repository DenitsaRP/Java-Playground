package ifElseStatment;

//We have to fill cistern with water. We have to use exactly two buckets simultaneously – 
//the first one is 2 liters and the second one is 3 liters.
//Write program that calculates how many times we have to use bathe buckets to fill cistern with
//capacity entered from user( natural number from 10 to 9999). Buckets can be used only entirely filled.

import java.util.Scanner;

public class FillCistern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter natural number between 10 and 9999");
		int numb = sc.nextInt();
		System.out.println("this is the volume of water than.");

		int fill = numb / 5;// The total volume of the buckets
		int rest = numb - (fill * 5);
		System.out.println("We will need exactly " + fill + " buckets - 2L and " + fill + " buckets - 3L");
		System.out.println("The rest will be filled with " + rest + "liters");
	}

}
