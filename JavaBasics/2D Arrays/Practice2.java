package array2D;

import java.util.Scanner;

public class Practice2 {

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
		
		boolean zigZag = false;
		for (int i = 1; i < array.length - 1; i += 2) {
			if (array[i] < array[i-1] && array[i] < array[i + 1]) {
				zigZag = true;
			} else if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				zigZag = true;
		//if ((array[i] < array[i-1] && array[i] < array[i + 1]) || (array[i - 1] < array[i] && array[i] > array[i + 1]));
		//zigZag = true;
			} else {
				break;
			}
		
		}
	//	System.out.println(zigZag? "The array is wit Zig - Zag structure" :"The array don't hane Zig - Zag structure");
		if (zigZag) {
			System.out.println("The array is wit Zig - Zag structure");
		} else {
			System.out.println("The array don't hane Zig - Zag structure");
		}
	}

}
