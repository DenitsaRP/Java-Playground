package stringsMethods;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1));
			array[i] = sc.nextInt();
			 
		}
		int[] array2 = new int [array.length];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Enter second array element " + (i + 1));
			array2[i] = sc.nextInt();
		}
		
		int[] array3 = multiply(array, array2);
		printArray(array3);
		

	}
	static int[] multiply(int[] array, int[] array2) {
		int[] arrayRez = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayRez[i] = array[i]*array2[i];
		}
		return arrayRez;
	}
	static void printArray(int[] array3) {
		System.out.println("The multiply array is: ");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}

}
