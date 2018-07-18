package loop;

//Да се изведат на екрана числат от -20 до 50.

public class Zad2 {

	public static void main(String[] args) {

		System.out.println("Numbers form -20 to 50:");
		System.out.println("For:");
		for (int i = -20; i <=50; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("While: ");

		int y = -20;
		while (y <= 50) {
			System.out.print(y + " ");
			y++;
		}

		System.out.println('\n'+ "Do - While: ");

		int z = -20;
		do {
			System.out.print(z + " ");
			z++;
		} while (z <= 50);
	}

}
