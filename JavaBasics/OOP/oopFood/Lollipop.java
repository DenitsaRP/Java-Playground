package oop.oopFood;

public class Lollipop extends Sweets {
	
	private static final double LOLLIPOP_CALORIES = 392; //per 100 grams

	public Lollipop() {
		super(25);
		
	}

	@Override
	double calculateCalories() {
		return (getQuantity()/100)*LOLLIPOP_CALORIES;
		
	}
	
	
	
	

}
