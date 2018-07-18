package array;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length: ");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}

		int count = 0;
		int tempCount = 0;
		int temp = 0;
		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
		}
		int mostCommen = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				temp = array[i];
				tempCount++;
			}
			if (tempCount > count) {
				mostCommen = temp;
				count = tempCount;
			}
		}
		while (count >= 0) {
			System.out.print(mostCommen + " " );	
			count--;
			}
	}
}
