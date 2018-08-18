package ifElseStatment;

//Write a program to read temperature in Centigrade and display a suitable message according to temperature state below.
// Temp <-20  Freezing weather; Temp -20 to 0  Very Cold weather
// Temp 0 to 15  Cold Temp; Temp 15 to 25 then Its Hot ; Temp > 25 then Its Very Hot

import java.util.Scanner;

public class TemperatureStateMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter degeese in C:");
		int deg = sc.nextInt();

		if (deg <= -20) {
			System.out.println("Freezing weather");
		} else if (deg <= 0 && deg > -20) {
			System.out.println("Very cold weather");
		} else if (deg > 0 && deg <= 15) {
			System.out.println("Cold");
		} else if (deg > 15 && deg <= 25) {
			System.out.println("Hot");
		} else if (deg > 25) {
			System.out.println("Very Hot");
		}

	}

}
