package loop;

// Print all numbers from 1 to 10 - revurse

public class PrintRevurseNumbersFrom1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numbers from 1 to 10 - revurse ");
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("While: ");

		int y = 10;
		while (y >= 1) {
			System.out.print(y + " ");
			y--;
		}

		System.out.println('\n' + "Do - While: ");

		int z = 10;
		do {
			System.out.print(z + " ");
			z--;
		} while (z >= 1);
	}

}
