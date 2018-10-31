package loops;

//Write a program in Java to make such a pattern 
//like a pyramid with a number which will repeat the number 

import java.util.Scanner;

public class PrintPatern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter piramid length: ");
		int num = sc.nextInt();
		
		for( int i = 0; i <= num; i++) {
			for (int j = 0 ; j <= j; j++) {
				System.out.print("." );
			}
			System.out.println(i);
			System.out.println();
		}
	}

}
