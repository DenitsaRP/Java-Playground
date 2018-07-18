package loop;

import java.util.Scanner;

public class Zad16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firs number:");		
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");		
		int num2 = sc.nextInt();
		
		for (int i = num2; i > num1; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
