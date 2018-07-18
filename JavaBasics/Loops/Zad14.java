package loop;

import java.util.Scanner;

public class Zad14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entr number from 10 to 200");
	//	int num = sc.nextInt();
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
