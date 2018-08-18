package array;

import java.util.Scanner;

//Write a program that creates an array of 20 elements of an integer type and initializes 
//each element with a value equal to the array element index multiplied by 5. The elements of the array to be displayed on the console.

public class ArrayIndexMultiplyedBy5ForElementValue {

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
