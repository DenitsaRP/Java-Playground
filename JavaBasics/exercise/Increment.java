package exercise;

import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter yor number:" );

		int numb1 = sc.nextInt();		
		
		numb1++;
		System.out.println("Number is: " + numb1);
		
		System.out.println("Number 2 is Postincrement to number 1: " );
		int numb2 = numb1++;
		System.out.println("Now, Number 2 is: " + numb2 + " and Number 1 is:" + numb1);
		
		System.out.println("Number 2 is Preincrement to number 1: " );
		numb2 = ++numb1;
		System.out.println("Now, Number 2 is: " + numb2 + " and Number 1 is:" + numb1);

	}

}
