package conditionalStatments;
import java.util.Scanner;

// Write a program that accepts two numbers from the user A and B(tipe double)
// after that enter third number C(type double). Print massage if number C is 
// between A and B number.

public class NumberCBetweenAAndB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number A:");
		double numA = sc.nextDouble();
		
		System.out.println("Enter second number B:");
		double numB = sc.nextDouble();
		
		System.out.println("Enter third number C:");
		double numC = sc.nextDouble();
		
		if ( numA < numB && numB > numC && numA < numC) {
			System.out.println("Number " + numC +
					" is between " + numA + 
					" and " + numB);
		} else if (numA > numB) {
			System.out.println("The number A is grater than number B");
		} else if ( numA < numB && numB < numC  ) {
			System.out.println("The number C is grater than number B");
		} else if ( numA < numB && numC < numA) {
			System.out.println("The number A is grater than number C");
		}
	}

}
