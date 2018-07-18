package array;

public class Masivi {

	public static void main(String[] args) {

		int[] grades = new int[5];// 5 променливи със стойност 0
		// { 84, 8, 0, 6, 14 }
		grades[1] = 8;
		
		grades[3] = 6;
		
		grades[4] = grades[1] + grades[3];
		
		grades[0] = grades[3] * grades[4];
		int[] grades2 = { 6, 7, 13, 5, 81 };// 5 променливи с конкретна стойнст
		
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		System.out.println(grades[4]);
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
	}

}
