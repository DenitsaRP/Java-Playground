package stringsMethods;

public class MethodExampels {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		int c = sum(a, b);
		System.out.println("end with " + c);

		String greeting1 = greet("Ivan");
		String greeting2 = greet("Kiro");
		System.out.println(greeting1);
		System.out.println(greeting2);

		System.out.println(greet("Pesho").toUpperCase());

		String upper = greet("Jessy").toUpperCase();
		System.out.println(upper);

	}

	static String greet(String name) {
		if (name.equals("Jessy")) {
			return "Hello, Mrs. " + name + ", how are you today?";

		}
		return "Hello, Mr. " + name + ", how are you today?";
	}

	static int sum(int x, int y) {
		int suma = x + y;
		return suma;
	}
}
