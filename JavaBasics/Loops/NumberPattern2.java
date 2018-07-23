package loop;

//Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
//3
//1 
//2 3 
//4 5 6
import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entr triangular number");
		int num = sc.nextInt();
		int printNum = 1;
		
		for ( int i = 1; i <= num ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(printNum + " ");
				printNum++;
			}
			System.out.println();
		}
	}

}
