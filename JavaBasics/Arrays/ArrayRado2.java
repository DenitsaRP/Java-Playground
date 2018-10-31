package arrays;

import java.util.Scanner;

public class ArrayRado2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array lenght");
		int num = sc.nextInt();
		
		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}

		int array[] = new int[num];
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("Enter elemnt " + (i+1));
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}

