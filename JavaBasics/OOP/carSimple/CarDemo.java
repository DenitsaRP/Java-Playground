package oop.carSimple;

public class CarDemo {

	public static void main(String[] args) {

		Person stamat = new Person();
		stamat.name = "Stamat Jelqzkov";
		stamat.age = 24;

		Person minka = new Person();
		minka.name = "Minka Ivanova";
		minka.age = 45;
		minka.gender = 'f';
		stamat.weight = 130;
		System.out.println("Stamat's weight is " + stamat.weight);
		stamat.eat(1.4);
		System.out.println("Stamat's weight is " + stamat.weight);
		
		System.out.println();
		System.out.println("Minka is " + minka.age + " years old");
		minka.growUp();
		System.out.println("Now, Minka is " + minka.age + " years old");
		System.out.println();
		
		minka.sleep(5);
		stamat.sleep(23);
		
		Car car1 = new Car("Mini One", false, "Black");
		car1.maxSpeed = 240;
		car1.currentSpeed = 120;
		car1.curruntGear = 5;
		car1.owner = stamat;
		car1.accelerate(150);
		car1.accelerate(20);
		System.out.println( "Now, Mini's current speed is: " + car1.currentSpeed);
		car1.changeColor("Blue");
		System.out.println( "Now, Mini's current color is: " + car1.color);
		
		
		System.out.println(car1.owner.name);
		System.out.println(car1.owner.age);

		Car car2 = new Car("Suzuki Swift", false, "Silver");
		car2.maxSpeed = 200;
		car2.currentSpeed = 80;
		car2.curruntGear = 4;
		
	}

}
