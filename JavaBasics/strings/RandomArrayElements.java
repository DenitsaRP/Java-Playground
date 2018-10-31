package strings;

import java.util.Random;
import java.util.Scanner;

//Generate random array elements between 1 and 100

public class RandomArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num < 0) {
			System.out.println("Enter positive number: ");
			num = sc.nextInt();
		}
		int[] array2 = generateArray(num);
		
		printArray(array2);

	}
	static int[]generateArray(int num){
		int[] array = new int[num];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100);
		}
		return array;
	}
	
	static void printArray(int[] array) {
		System.out.println("The array is: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
		}
	}

}
