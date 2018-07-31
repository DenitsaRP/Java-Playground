package oopCar;

public class Demo {

	public static void main(String[] args) {

		Car bmw = new Car("BMW M3", true, "Black");
		bmw.price = 25000;
		bmw.maxSpeed = 240;
		
		Car kia = new Car("Ceed", false, "White");
		kia.price = 7800;
		kia.maxSpeed = 200;
		
		System.out.println("Is " + bmw.model + " more expensive than " + kia.model + " ? - " + bmw.isMoreExpensive(kia));
		
		bmw.calculateCarPriceForScrap(35.10);
		kia.calculateCarPriceForScrap(14.5);
		
		Person spiro = new Person("Spiridon", 32500, true);
		spiro.buyCar(bmw);
		
		Person mina = new Person("Mina", 22000.5, false);
		mina.buyCar(kia);
		
		spiro.sellCarForScrap();
		
	}

}
