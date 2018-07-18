package loop;

public class Zad3 {

	public static void main(String[] args) {

		System.out.println("Numbers form -10 to 10:");
		System.out.println("For:");
		for (int i = -10; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("While: ");

		int y = -10;
		while (y <= 10) {
			if (y % 2 != 0) {
				System.out.print(y + " ");
			}
			y++;
		}

		System.out.println('\n' + "Do - While: ");

		int z = -10;
		do {
			if ( z % 2 != 0 ) {
				System.out.print(z + " ");
			}
			z++;
		} while (z <= 10);
	}

}
