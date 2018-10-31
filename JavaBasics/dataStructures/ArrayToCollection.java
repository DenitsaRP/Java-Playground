package dataStructures;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToCollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to add to the array:");
		int n = sc.nextInt();
		String[] array = new String[n];
		System.out.println("Please enter " + n + " strings: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element: " + (i + 1));
			array[i] = sc.nextLine();
		}

		List<String> list = Arrays.asList(array);
		System.out.println();

		for (String li : list) {
			String str = li;
			System.out.println(str + " ");
		}
	}

}
