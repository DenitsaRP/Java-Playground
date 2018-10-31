package conditionalStatments;

import java.util.Scanner;

public class Grates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter grate from 2 to 6:");
		int grate = sc.nextInt();

		if (grate == 2) {
			System.out.println("Slab");
		} else if (grate == 3) {
			System.out.println("Sreden");
		} else if (grate == 4) {
			System.out.println("Dobur");
		} else if (grate == 5) {
			System.out.println("Mnogo dobur");
		} else if (grate == 3) {
			System.out.println("Otlichen");
		} else {
			System.out.println("Inalid grade!");
		}
	}
}
