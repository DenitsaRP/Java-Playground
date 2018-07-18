package exercise;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter circle radius in cm:");
		double rad = sc.nextDouble();
		double area = (Math.PI*Math.pow(rad, 2));
		
		System.out.println("Circle Area: = " + area+"cm2");
	}

}
