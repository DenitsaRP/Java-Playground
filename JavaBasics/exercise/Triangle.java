package exercise;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side A:");
		int sideA = sc.nextInt();
		System.out.println("Enter side B:");
		int sideB = sc.nextInt();
		System.out.println("Enter side C:");
		int sideC = sc.nextInt();
		
		boolean triangle = ((sideA + sideB > sideC && sideA+ sideC > sideB && sideB + sideC > sideA));
		System.out.print("Is it triangle? "+ triangle);
	}

}
