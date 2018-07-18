package array;

import java.util.Scanner;

public class Zad1Nakov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The array is with 20 elements");

		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;			;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	
	}

}
