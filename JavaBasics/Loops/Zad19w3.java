package loop;

import java.util.Scanner;

public class Zad19w3 {

	public static void main(String[] args) {
		// 19. Write a program in Java to make such a pattern 
		//like a pyramid with a number which will repeat the number 
		
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
