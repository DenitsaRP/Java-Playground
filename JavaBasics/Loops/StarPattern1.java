package loop;

//  *
// ***
//*****

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int numb = sc.nextInt();

		int numberOfSpaces = numb - 1;
		int numberOfStars = 1;

		for (int row = 1; row <= numb; row++) {
			for (int s = 1; s <= numberOfSpaces; s++) {
				System.out.print(" ");
			}
			numberOfSpaces--;
			for (int p = 1; p <= numberOfStars; p++) {
				System.out.print("*");
			}
			numberOfStars += 2;
			System.out.println();
		}
	}

}
