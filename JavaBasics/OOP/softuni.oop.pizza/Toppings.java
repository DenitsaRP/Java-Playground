package softuni.oop.pizza;

public class Toppings implements Calculatable {
	
	public static final String TOPPING_TYPES[][] = {{"Meat", "1.2"}, { "Veggies", "0.8"}, {"Cheese", "1.1"}, {"Sause", "0.9"}}; 
	
	private String toppingType;
	private double toppingTypeModifier;
	private int weightInGrams;
	

	public Toppings(String toppingType, int weightInGrams) throws Exception {
		validateTypeTopping(toppingType);
		validateToppingWeight(weightInGrams);
		
	}
	
	private void validateTypeTopping(String toppingType) throws Exception {
		for (int i = 0; i < TOPPING_TYPES.length; i++) {
			String currentToppingType = TOPPING_TYPES[i][0];
			if(currentToppingType.equalsIgnoreCase(toppingType)) {
				this.toppingType =  TOPPING_TYPES[i][0];
				this.toppingTypeModifier =  Double.parseDouble(TOPPING_TYPES[i][1]);
			}
		}
		
		if(this.toppingType == null) {
			throw new Exception("Invalid topping type.");
		}
		
	}
	
	private void validateToppingWeight(int weightInGrams) throws Exception {
		if(weightInGrams < 0 || weightInGrams > 50 ) {
			throw new Exception( this.toppingType + " weight should be in the range [1..50]");
		}
		this.weightInGrams = weightInGrams;
	}

	@Override
	public double calculaateCalories() {
		return CALORIES*this.weightInGrams*this.toppingTypeModifier;
	}
	
	
}
