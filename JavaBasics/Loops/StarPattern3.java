package loops;

//  *
// ***
//*****
import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter star pattern length:");
		int num = sc.nextInt();

		int count = num - 1;
		for (int k = 1; k <= num; k++) {
			for (int i = 1; i <= count; i++)
				System.out.print(" ");
			count--;
			for (int i = 1; i <= 2 * k - 1; i++)
				System.out.print("*");
			System.out.println();

		}
	}
}