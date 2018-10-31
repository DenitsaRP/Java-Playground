package loops;

public class DoWhille {

	public static void main(String[] args) {

		// do while
		System.out.println("do - while loop");
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);

		// while
		System.out.println("while loop");
		int y = 1;
		while (y <= 10) {
			System.out.println(y);
			y++;
		}

		// for loop
		System.out.println("for loop");
		for (int z = 1; z <= 10; z++) {
			System.out.println(z);
		}
	}
}
