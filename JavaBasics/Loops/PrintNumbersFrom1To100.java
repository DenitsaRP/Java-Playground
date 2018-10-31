package loops;

public class Zad1 {

	public static void main(String[] args) {

		System.out.println("Numbers form 1 to 100:");
		System.out.println("For:");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		System.out.println("While: ");

		int y = 1;
		while (y <= 100) {
			System.out.println(y);
			y++;
		}

		System.out.println("Do - While: ");

		int z = 1;
		do {
			System.out.println(z);
			z++;
		} while (z <= 100);
	}

}
