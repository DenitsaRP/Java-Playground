package stringsMethods;

public class SwapString {

	public static void main(String[] args) {
		String a = "Silva";
		String b = "Nikol";
		System.out.println(a + " " + b);
		swap (a, b);
		System.out.println(a);
		System.out.println(b);
	}
	
	static void swap(String x, String y) {
		String z = x;
		x = y;
		y = z;
		
	}

}
