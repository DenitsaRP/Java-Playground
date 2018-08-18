package ifElseStatment;

import java.util.Scanner;

public class SwitchCaseWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day of the week:");
		int dayOfWeek = sc.nextInt();

		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesda");
			break;
		case 4:
			System.out.println("Tuesday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Satuday");
			break;
		case 7:
			System.out.println("Sunday");
		default:
			System.out.println("There is no day of the week like this.");
			break;
		}

	}
}
