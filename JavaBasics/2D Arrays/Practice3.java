package array2D;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		char[] array = { 'g', 'f', 'd', 'a', 'k', 'u', 'p' };
		
		System.out.println("Enter character: ");
		char ch = sc.nextLine().charAt(0);
		
		boolean exists = false;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				exists = true;
				index = i;
				break;
			}
		}
		if (exists) {
			System.out.println("Ima go na index " + index);
		} else {
			System.out.println("Nqma go");
		}
	}

}
