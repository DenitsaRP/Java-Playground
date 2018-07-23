package array;

//Write program that takes array elements from user – only natural numbers.  
//Print one of the element, which is closest to average sum of all elements of the array


import java.util.Scanner;

public class ElementClosestToAvarageSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element" + (i + 1));
			array[i] = sc.nextInt();
			while (array[i] <= 0) {
				System.out.println("Enter positive number for element: " + (i + 1));
				array[i] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		int avg = sum / array.length;
		
		System.out.println(avg);
		
		int[] diffArray = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			int diff = (array[i] - avg);
			if(diff < 0) {
				diff = diff * (-1);
			}
			diffArray[i] = diff;
		}
		
		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i = 0; i < diffArray.length; i++) {
		if(diffArray[i] < min) {
			min = diffArray[i];
			index = i;
		}
		}
		
		System.err.println("Closest element : " + array[index]);
		
		
		
	}
}
