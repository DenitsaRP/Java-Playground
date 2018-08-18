package oopMortalKombat;

import java.util.Iterator;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		Fighter krasi = new Fighter("Krasi", 200, 40, 20, 30);
		Fighter sasho = new Fighter("Sasho", 200, 40, 30, 30);
		int counter = 1;
		int krasiWins = 0;
		int sashoWins = 0;
		for (int i = 0; i < 100; i++) { 

			while (true) {
				System.out.println("ROUND " + counter++);
				if (new Random().nextBoolean()) {
					krasi.hit(sasho);
					if (sasho.isDead()) {
						System.out.println(krasi.getName() + " Wins!");
						krasiWins++;
						break;

					}
					sasho.hit(krasi);
					if (krasi.isDead()) {
						System.out.println(sasho.getName() + " Wins!");
						sashoWins++;
						break;
					}
				} else {
					sasho.hit(krasi);
					if (krasi.isDead()) {
						System.out.println(sasho.getName() + " Wins!");
						sashoWins++;
						break;
					}
					krasi.hit(sasho);
					if (sasho.isDead()) {
						System.out.println(krasi.getName() + " Wins!");
						krasiWins++;
						break;
					}
				}
			}
			
			krasi.revive();
			sasho.revive();

			krasi.printInfo();
			sasho.printInfo();
			System.out.println(krasi.getName() + " wins " + krasiWins);
			System.out.println(sasho.getName() + " wins " + sashoWins);
		}

	}

}
