package exercise;

import java.util.Scanner;

public class DevideTo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		boolean dev = false;
		dev = (num % 7!=0);
		System.out.println("Is it with remainder :" + dev);

	}

}
