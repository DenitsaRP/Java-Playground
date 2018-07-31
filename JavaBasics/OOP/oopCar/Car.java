package oopCar;

public class Car {

	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	boolean isSportCar;
	int price;
	Person owner;

	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;

	}

	boolean isMoreExpensive(Car car) {
		return this.price > car.price;
	}

	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		double toalAmount = 0;
		if (this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("White")) {
			toalAmount = metalPrice*(coef+0.05);
			System.out.println("The car is " + this.color + "  and the total amount for scrap is: " + toalAmount);
		} else if (this.isSportCar) {
			toalAmount = metalPrice*(coef+0.05);
			System.out.println("It is sport car and the total amount for scrap is: " + toalAmount);
		} else {
			toalAmount = metalPrice*coef;
			System.out.println("The total amount is " + toalAmount);
		}
		return toalAmount;

	}
	
	void changeOwner(Person newOwner) {
		this.owner = newOwner;
		//System.out.println(this.model + " has new owner " + newOwner);
	}

}
