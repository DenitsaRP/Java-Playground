package oop.oopFood;

public class Toblerone extends Sweets{

	private static final double TOBLERONE_HUGE_BAR = 4500;
	private static final int TOBLERONE_HUGE_CALORIES = 24545;

	public Toblerone() {
		super(TOBLERONE_HUGE_BAR);
	}

	@Override
	double calculateCalories() {
		
		return TOBLERONE_HUGE_CALORIES;
	}
	
	public void brakToPieces() {
		System.out.println("Chup - chup");
	}
	

}
