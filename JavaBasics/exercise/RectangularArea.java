package exercise;

import java.util.Scanner;

public class RectangularArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length in cm: ");
		int leng = sc.nextInt();
		
		System.out.println("Entr breadth in cm: ");
		int bread = sc.nextInt();
		
		int area = leng*bread;
		System.out.println("The area is: " + area + "cm2");
	}

}
