package oop.oopFood;

public abstract class Food {
	
	public static final double ENERGY_MODIFIER = 4.184;
	
	private double calories;
	private double quantity;
	private boolean isTasty;
	private boolean isSalty;
	
	
	
	public Food(double quantity, boolean isTasty, boolean isSalty) {
		super();
		this.calories = calculateCalories();
		this.quantity = quantity;
		this.isTasty = isTasty;
		this.isSalty = isSalty;
	}

	abstract double calculateCalories();

	public double getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isTasty() {
		return isTasty;
	}

	public void setTasty(boolean isTasty) {
		this.isTasty = isTasty;
	}

	public boolean isSalty() {
		return isSalty;
	}

	public void setSalty(boolean isSalty) {
		this.isSalty = isSalty;
	}

	double giveEnergy() {
		return this.calories*ENERGY_MODIFIER;//returns jauls
	}
}
