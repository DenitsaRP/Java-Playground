package oop.oopCarShop;

public class CarDemo {

	public static void main(String[] args) {

	Person pesho = new Person("Pesho");
	pesho.setAge(24);
	Person ivan = new Person("Ivan");
	ivan.setAge(27);
	Person mimi = new Person("Maria");
	mimi.setAge(25);
	
	Car bmw = new Car("BMW 320", false, "Black");
	bmw.setMaxSpeed(220);
	bmw.setPrice(13200);
	Car ford = new Car("Ford Fiesta", true, "Blue");
	ford.setMaxSpeed(260);
	ford.setPrice(18300);
	Car renult = new Car("Renult Clio", false, "Red");
	renult.setMaxSpeed(180);
	renult.setPrice(4500);
	Car wv = new Car("WV Passat", false, "Silver");
	wv.setMaxSpeed(240);
	wv.setPrice(8900);
	
	CarShop bbb = new CarShop(3);
	
	System.out.println(bbb.addCar(wv));
	System.out.println(bbb.addCar(renult));
	System.out.println(bbb.addCar(ford));
	System.out.println(bbb.addCar(bmw));
	
	bbb.sellLastAddCar(mimi);
	
	bbb.showAllCarsInTheShop();
	
	System.out.println(bbb.addCar(bmw));
	bbb.showAllCarsInTheShop();
	
	
		
	}

}
