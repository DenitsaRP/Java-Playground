package strings;

public class StringConvertToAnInt {
	// int to String and String to int
	public static void main(String[] args) {
		
		String digToInt = "123";
		int i = 123;
		String newI = String.valueOf(i);
		String newII = Integer.toString(i);
		System.out.println(newI + " or " + newII);
		int i2 = Integer.parseInt(digToInt);
		System.out.println(i2);

	}

}
