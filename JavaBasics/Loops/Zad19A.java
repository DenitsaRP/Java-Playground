package loop;

import java.util.Scanner;

public class Zad19A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in );
		System.out.println("Enter firs number:");
		double num = sc.nextDouble();
		double calculation = num;

	
			while (calculation != 1) {
			if (calculation % 2 != 0) {
				calculation = ((calculation * 3) + 1);
				System.out.print(String.format("%.0f", calculation) + " ");
				
			} else {
				calculation = calculation * (0.5);
				System.out.print(String.format("%.0f", calculation) + " ");
				
			}
		
			if (calculation == 1) {
				break;
			}

		}
		// }

	}


}
