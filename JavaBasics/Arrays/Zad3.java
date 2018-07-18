package array;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter number for the first two elements: ");
		int num = sc.nextInt();
		
		int array[] = new int [10];
		array[0] = num;
		array[1] = num;
		
		for (int i = 2; i < array.length; i++ ) {
			array[i] = (array[i - 1]) + (array[ i - 2]);
		}
		
		for (int i = 0; i < array.length; i++ ) {
			System.out.print(array[i] + " ");
		}
		
	}

}
