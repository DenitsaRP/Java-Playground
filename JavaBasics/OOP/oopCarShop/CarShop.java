package oop.oopCarShop;

public class CarShop {

	private int capacity;
	private Car[] carLot;
	private Person shopOwner;

	public Person getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(Person shopOwner) {
		this.shopOwner = shopOwner;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Car[] getShop() {
		return carLot;
	}

	public void setShop(Car[] shop) {
		this.carLot = shop;
	}

	CarShop(int capacity) {
		this.capacity = capacity;
		this.carLot = new Car[capacity];
	}

	boolean addCar(Car car) {
		boolean carToTheShop = false;
		for (int i = 0; i < this.carLot.length; i++) {
			if (this.carLot[i] == null) {
				this.carLot[i] = car;
				this.carLot[i].setOwner(this.shopOwner);
				carToTheShop = true;
				break;
			}
		}
		return carToTheShop;
	}

	boolean removeCar(Car car) {
		this.carLot[this.carLot.length - 1] = null;
		return true;
	}

	void sellLastAddCar(Person buyer) {
		this.carLot[this.carLot.length - 1].setOwner(buyer);
		System.out.println("the last add car is " + this.carLot[this.carLot.length - 1].getModel()
				+ " and it's bought from " + buyer.getName());
		removeCar(this.carLot[carLot.length - 1]);
		System.out.println("The car is removed from the shop");
	}

	void showAllCarsInTheShop() {
		for (int i = 0; i < this.carLot.length; i++) {
			if(this.carLot[i] == null) {
				break;
			}
			System.out.println("The model is " + this.carLot[i].getModel());
			System.out.println("The color is " + this.carLot[i].getColor());
			System.out.println("The MAX speed is " + this.carLot[i].getMaxSpeed());
			System.out.println("The price is " + this.carLot[i].getPrice());
			System.out.println();
		}
	}

}
