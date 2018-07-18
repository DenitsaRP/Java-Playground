package array;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		while (num <= 0 ) {
			System.out.println(" Enetr positive number: ");		
			num = sc.nextInt();
		}
		
		
//		int temp;
//		while (num > 0) {
//			temp = num / 2;
//			num = temp;
			
//		}
		System.out.println(num%2); 
	//	int array[] = new int[];
	//	for (int i = 0; i < array.length; i++)
	}

}
