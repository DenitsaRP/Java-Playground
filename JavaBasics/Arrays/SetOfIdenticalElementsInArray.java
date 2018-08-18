package array;

import java.util.Scanner;

//Write a program that finds the maximum set of identical elements in an array. 
//Example: {2, 1, 1, 2, 3, 3, 2, 2, 2, 1} - {2, 2, 2}.

public class SetOfIdenticalElementsInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter array length: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number!");
			num = sc.nextInt();
		}
		
		int[] array = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter elemen " + (i + 1));
			array[i] = sc.nextInt();
		}
		
		int count = 0;
		int commen = array[0];
		int temp = 0;
		for (int i = 0; i < array.length - 1 ; i++) {
			if (array[i] == array [i + 1 ]) {
				count++;	
				if (temp <= count) {
					temp = count;
					commen = array[i];
				}
			}
		}
		while (count >= 0) {
		System.out.print(commen + " " );	
		count--;
		}
		
	}

}
