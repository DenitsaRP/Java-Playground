package loop;

import java.util.Scanner;

public class Zad10Nakov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix size: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 0 + i; j < num + i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
