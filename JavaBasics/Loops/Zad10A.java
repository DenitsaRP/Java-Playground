package loop;

import java.util.Scanner;

public class Zad10A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();

		int count = 0;
		boolean isSimple = true;
			
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Chisloto NE e prosto");
				isSimple = false;
				break;
			}
		}
		
		if(isSimple) {
			System.out.println("Chisloto e prosto");
		}
	}

}
