package oop.oopFood;

public abstract class Sweets extends Food{

	@Override
	double giveEnergy() {
		return super.giveEnergy()*3;
	}

	public Sweets(double quantity) {
		super(quantity, true, false);
	
	}
	
	

}
