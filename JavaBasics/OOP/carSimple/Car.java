package oop.carSimple;

public class Car {
		
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int curruntGear;
	Person owner;
	boolean isSportCar;
	int price;
	
	Car (String modelParam, boolean isSportCarParam, String colorParam){
		model = modelParam;
		isSportCar = isSportCarParam;
		color = colorParam;
		currentSpeed = 0;
		curruntGear = 0; 		
	}
	
	void accelerate(int speed) {
		if((currentSpeed + speed) > maxSpeed) {
			System.out.println("You are over your max speed, which is " + maxSpeed + ". Please try to accelerate according your current speed - " + currentSpeed);
			
		} else {
		currentSpeed += speed;	
		}
	}
	
	void changeGearUp() {
		if(curruntGear > 5) {
			System.out.println("You can not enter greater gear!");
		} else {
			curruntGear++;
		}
	}
	
	void changeGearDown(int gear) {
		if(gear < 0 && gear > 5) {
			System.out.println("Enter gear between 1 and 5!");
		}
		if(curruntGear < gear) {
			System.out.println("Please, enter gear, which is less than current gear - " +  curruntGear);
		} else {
			curruntGear = gear;
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 0 && nextGear > 5) {
			System.out.println("Enter gear between 1 and 5!");
		}
	}
	
	void changeColor(String newColor) {
		if (newColor.equals(color)) {
			System.out.println("Please, choose color different than the original");
		}
		color = newColor;
	}
	
	 boolean isMoreExpensive(Car car) {
		return this.price > car.price;
		}
}
