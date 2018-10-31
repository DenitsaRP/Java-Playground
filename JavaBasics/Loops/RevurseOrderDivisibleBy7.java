package loops;

//Write program, which takes number from the user - between 10 and 200.
//Print in reverse order all numbers - from entered to 0, which are divisible by 7.

import java.util.Scanner;

public class RevurseOrderDivisibleBy7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entr number from 10 to 200");
		int num;
		
		do {
			num = sc.nextInt();
			
		} while (!(num>10&&num<200));
		
		for (int i = num; i > 10; i--) {
			if (i % 7 ==0) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}

	}

}
