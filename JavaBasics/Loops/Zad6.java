package loop;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int numb = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= numb; i++) {
			
			sum = sum + i;
		}
		System.out.println("The sum is: " + sum);

	}

}
