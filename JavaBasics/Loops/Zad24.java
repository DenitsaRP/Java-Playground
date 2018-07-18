package loop;

import java.util.Scanner;

public class Zad24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Enter number: ");
			num = sc.nextInt();
		} while (!(num >= 10 && num <= 30000));

		int dev1 = (num / 10000) % 10; //10000
		int dev2 = (num / 1000) % 10; //1000
		int dev3 = (num / 100) % 10; //100
		int dev4 = (num / 10) % 10; //10
		int dev5 = (num % 10); //1

		if (dev1 != 0) {
			if (dev1 == dev5 && dev2 == dev4) {
				System.out.println("Chisloto e palindrom");
			} else {
				System.out.println("Chisloto NE e palindrom");
			}
		} else if (dev2 != 0) {
			if (dev2 == dev5 && dev3 == dev4) {
				System.out.println("Chisloto e palindrom");
			} else {
				System.out.println("Chisloto NE e palindrom");
			}
		} else if (dev3 != 0) {
			if (dev3 == dev5) {
				System.out.println("Chisloto e palindrom");
			} else {
				System.out.println("Chisloto NE e palindrom");
			}
		} else if (dev4 != 0) {
			if (dev4 == dev5) {
				System.out.println("Chisloto e palindrom");
			} else {
				System.out.println("Chisloto NE e palindrom");
			}
		}

	}

	// System.out.println("mod 1 :" + num % 10);
	// System.out.println("mod 10 :" + (num / 10) % 10);
	// System.out.println("mod 100 :" + (num / 100) % 10);
	// System.out.println("mod 1000 :" + (num / 1000) % 10);
	// System.out.println("mod 10000 :" + (num / 10000) % 10);
}
