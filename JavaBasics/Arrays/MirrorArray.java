package arrays;

//Write program that checks if the entered array is mirror.

import java.util.Scanner;

public class MirrorArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}

		boolean mirror = false;
		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + (i + 1));
			array[i] = sc.nextInt();
		}
		if (num == 1) {
			mirror = true;
		} else  {

			for (int i = 0; i < array.length / 2; i++) {
				if (array[i] != array[(array.length - 1) - i]) {
					mirror = false;
					break;					
				} else {
					mirror = true;
				}

			}
		}
		if (mirror) {
			System.out.println("Mirror");
		} else {
			System.out.println("Not mirror");
		}
	}

}
