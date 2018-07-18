package stringsMethods;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {

		System.out.println("Enter two names separated by comma: ");
		String text = enterName();

		while (!containsIntervals(text)) {
			System.out.println("Please enter full names devide by intervals and one comma");
			text = enterName();
		}

		String[] textSplit = text.split(",");
		String name1 = textSplit[0];
		String name2 = textSplit[1];

		int firsNameinASCII = stringToASCII(name1);
		int secondNameinASCII = stringToASCII(name2);
		System.out.println("The name with the biggest sum in ASCII is: ");
		if (firsNameinASCII > secondNameinASCII) {
			System.out.println(name1);
		} else {
			System.out.println(name2);
		}

	}

	static String enterName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		return name;
	}

	static boolean containsIntervals(String text) {
		String word = text;
		int sum = 0;
		boolean intervals = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				sum++;
			}
		}
		if (sum == 5) {
			intervals = true;
		} else {
			intervals = false;
		}
		return intervals;

	}

	static int stringToASCII(String text) {
		String word = text;
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum += (int) word.charAt(i);
		}
		return sum;
	}
}
/*
 * String names = "prappo,prince,ahsan"; String[] namesList = names.split(",");
 * you can access like
 * 
 * String name1 = names[0]; String name2 = names[1]; or using loop
 * 
 * for(String name : namesList){ System.out.println(name); }
 * 
 */
