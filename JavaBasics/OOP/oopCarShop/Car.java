package oop.oopCarShop;

public class Car {
		
	private String model;
	private int maxSpeed;
	private String color;
	private Person owner;
	private boolean isSportCar;
	private int price;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed > 0) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out.println("You have to enter positive number for MAX speed.");
		}
	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public boolean isSportCar() {
		return isSportCar;
	}

	public void setSportCar(boolean isSportCar) {
		this.isSportCar = isSportCar;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Car (String model, boolean isSportCar, String color){
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;	
	}
	
	
	
	
}
