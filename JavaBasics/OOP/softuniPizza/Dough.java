package oop.softuniPizza;

public class Dough implements Calculatable {
	
		private static final String FLOUR_TYPES[][] = {{"White", "1.5"}, {"WholeGrain", "1.0"} };
	private static final String BAKING_TECHNIQUES[][] = {{"Crispy", "0.9"}, {"Chewy", "1.1"}, {"Homemade", "1.0"}};
	
	private String flourType;
	private double flourTypeModifier;
	private String bakingTechnique;
	private double bakingTechniqueModifier;
	private int weightInGrams;

	public Dough(String flourType, String bakingTechnique, int weightInGrams) throws Exception {
		//vaidateTypes(flourType, FLOUR_TYPES, this.flourType, this.flourTypeModifier)
		validateFlourType(flourType);
		validateBakingTechniques(bakingTechnique);
		validateDoughWeight(weightInGrams);
		
	}
	
	// TODO: validateFlourType & validateBakingTechniques -> make one method
	// validateTypes(String type, String[][] possibleTypes, String memberVariable, double memberModifier)
	
	private void validateFlourType(String flourType) throws Exception {
		for (int i = 0; i < FLOUR_TYPES.length; i++) {
			String currentFlourType = FLOUR_TYPES[i][0];
			if(flourType.equalsIgnoreCase(currentFlourType)) {
				this.flourType = FLOUR_TYPES[i][0];
				this.flourTypeModifier = Double.parseDouble(FLOUR_TYPES[i][1]);
				break;
			}
		}
		
		if(this.flourType == null) {
			throw new Exception("Invalid type of dough.");
		}
	}
	
	private void validateBakingTechniques(String bakingTechnique) throws Exception {
		for (int i = 0; i < BAKING_TECHNIQUES.length; i++) {
			String currentBakingTechnique = BAKING_TECHNIQUES[i][0];
			if(bakingTechnique.equalsIgnoreCase(currentBakingTechnique)) {
				this.bakingTechnique = BAKING_TECHNIQUES[i][0];
				this.bakingTechniqueModifier = Double.parseDouble(BAKING_TECHNIQUES[i][1]);
				break;
			}
		}
		
		if(this.bakingTechnique == null) {
			throw new Exception("Invalid type of baking technique.");
		}
	}
	
	private void validateDoughWeight(int weightInGrams) throws Exception {
		if(weightInGrams > 200 || weightInGrams < 0) {
			throw new Exception("Dough weight should be in the range [1..200]");
		} else {
			this.weightInGrams = weightInGrams;
		}
	}

	@Override
	public double calculaateCalories() {
		return CALORIES*this.weightInGrams*this.flourTypeModifier*this.bakingTechniqueModifier;
	}
	
	
		
}
