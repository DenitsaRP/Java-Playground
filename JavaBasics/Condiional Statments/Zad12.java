package ifElseStatment;

import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.println("Enter day of the year:");
		 int day = sc.nextInt();
		
		System.out.println("Enter mounth of the year:");
		int month = sc.nextInt();

		System.out.println("Enter year:");
		int year = sc.nextInt();

		// int dev = year%4;
		// System.out.println(dev);
		if (year % 4 == 0 || (year / 100) % 4 == 0) {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				int nextDay = day + 1;
				if (nextDay >31) {
					nextDay = 1;
					System.out.println(nextDay + ","+ (month + 1)+"," + year );
				} else {
					System.out.println(nextDay + ","+ month+"," + year );
				}
				System.out.println();
				break;
			case 2:
				int nextDay2 = day + 1;
				if (nextDay2 >29) {
					nextDay2 = 1;
					System.out.println(nextDay2+ ","+ (month + 1)+"," + year);
				} else {
					System.out.println(nextDay2+ ","+ month +"," + year);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				int nextDay3 = day + 1;
				if (nextDay3 >30) {
					nextDay3 = 1;
					System.out.println(nextDay3+ ","+ (month + 1)+"," + year);
				} else {
					System.out.println(nextDay3+ ","+ month+"," + year);
				}
				System.out.println();
				break;
			
			}

		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				int nextDay = day + 1;
				if (nextDay >31) {
					nextDay = 1;
					System.out.println(nextDay + ","+ (month + 1)+"," + year );
				} else {
					System.out.println(nextDay + ","+ month+"," + year );
				}
				System.out.println();
				break;
			case 2:
				int nextDay2 = day + 1;
				if (nextDay2 >28) {
					nextDay2 = 1;
					System.out.println(nextDay2+ ","+ (month + 1)+"," + year);
				} else {
					System.out.println(nextDay2+ ","+ month +"," + year);
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				int nextDay3 = day + 1;
				if (nextDay3 >30) {
					nextDay3 = 1;
					System.out.println(nextDay3+ ","+ (month + 1)+"," + year);
				} else {
					System.out.println(nextDay3+ ","+ month+"," + year);
				}
				System.out.println();
				break;
			
			}
		}
	}

}
