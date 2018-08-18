package array;

import java.util.Random;
import java.util.Scanner;

//Write program that random generate two arrays. 
//Multilpy two arrays and print it on the screen. 

public class MultilpyArraysRandom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number:");
			num = sc.nextInt();
		}
		
		int[] array = generateArray(num);
		System.out.println("The first array is:");
		printArray(array);
		
		System.out.println();
		int[] array2 = generateArray(num);
		System.out.println("The second array is: ");
		printArray(array2);
		
		System.out.println();
		int[] array3 = multiply(array, array2);
		System.out.println("The multiply  array is: ");
		printArray(array3);
		

	}
	
	static int[] generateArray(int num) {
		int arr[] = new int[num];
		Random r = new Random();
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		return arr;
	}
	
	static int[] multiply(int[] array, int[] array2) {
		int[] arrayRez = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayRez[i] = array[i]*array2[i];
		}
		return arrayRez;
	}
	static void printArray(int[] array3) {
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}

}
