package strings;

public class ReverseString {

	public static void main(String[] args) {
		// Write a Java program to reverse a String:
		// 1. StringBuilder
		String s = "Hel lo";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		System.out.println();
		System.out.println("----------------");
		// 2.For Loop;
		String st = "hello";
		for (int i = st.length() - 1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
	}

}
