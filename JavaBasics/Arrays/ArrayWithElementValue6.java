package arrays;

import java.util.Scanner;

// 1. input positive number; 2. keep trying until positive
// 3. create array of elements; 4. int each variable with value 6
// 5 print the array

public class ArrayWithElementValue6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
		
		while (num <= 0) {
			System.out.println("Enter new number:");
			num = sc.nextInt();
		}
		
		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			array[i] = 6;
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
