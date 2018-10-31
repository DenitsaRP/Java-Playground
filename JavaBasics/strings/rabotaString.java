package strings;

import java.util.Scanner;

public class rabotaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 4;
		String y = "proba";
		String y1 = "proba";
		String z = new String(" Proba");
		System.out.println(y == y1);
		System.out.println(y == z);
		
		y1 = y1 + " ! ";
		System.out.println(y);
		System.out.println(y1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String text = sc.nextLine();
		
		System.out.println("You have entered: " + text);
	}

}
