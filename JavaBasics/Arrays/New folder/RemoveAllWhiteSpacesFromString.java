package strings;

import java.util.Scanner;

public class RemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.nextLine();
		String[] str1Array = str1.trim().split("\\s+");
		for (String strWord : str1Array) {
			System.out.print(strWord);
		}

	}

}
