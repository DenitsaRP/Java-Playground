package oop.oopFood;

public class Cabbage extends Food{
	
		private static final double CABBAGE_CALORIES = 24.6;
	
		public Cabbage(double quantity) {
		super( quantity, false, false);
		
	}


		@Override
		double giveEnergy() {
			
			return 0;
		}

		@Override
		double calculateCalories() {
			
			return (this.getQuantity()/100)*CABBAGE_CALORIES;
		}

}
