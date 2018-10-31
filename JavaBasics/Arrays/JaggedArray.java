package arrays;

import java.util.Scanner;

//A one - dimensional array is called jagged if each element in the array is > from the previous
//and < from the next. Write down program that checks whether an array of numbers is jagged.

public class JaggedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}
		
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i+1));
			array[i] = sc.nextInt();
		}
		
		boolean jagged = false;
		for (int i = 1; i < array.length - 1; i += 2) {
			if (array[i] < array[i-1] && array[i] < array[i + 1]) {
				jagged = true;
			} else if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				jagged = true;
		//if ((array[i] < array[i-1] && array[i] < array[i + 1]) || (array[i - 1] < array[i] && array[i] > array[i + 1]));
		//jagged = true;
			} else {
				break;
			}
		
		}
	//	System.out.println(jagged? "The array is jagged" :"The array isn't jagged");
		if (jagged) {
			System.out.println("The array is jagged");
		} else {
			System.out.println("The array isn't jagged");
		}
	}

}
