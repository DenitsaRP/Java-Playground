package oopCar;

import java.security.acl.Owner;

public class Person {

	String name;
	int age;
	double weight;
	char gender;
	int height;
	double money;
	Car car;

	Person() {
		this.age = 0;
		this.weight = 4;
	}

	Person(String name, double money, boolean isMale) {
		this();
		this.name = name;
		this.money = money;
		this.gender = isMale ? 'm' : 'f';

	}
	
	void buyCar(Car car) {
		if(this.money >= car.price) {
			System.out.println(this.name + " can buy " + car.model);
			this.money -= car.price;
			this.car = car;
			car.changeOwner(this);
			System.out.println(this.name + " bought the car and now he has " + this.money + "lv");
		} else {
			System.out.println(this.name + " can not buy " + car.model);
		}
	}
	
	double sellCarForScrap() {
		this.money += this.car.calculateCarPriceForScrap(45.8);
		this.car.owner = null;
		this.car = null;
		System.out.println("After seling car for crap " + this.name + " have " + this.money + "lv");
		return this.money;
	}

}
