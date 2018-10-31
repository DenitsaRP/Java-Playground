package oop.oopZoo;

public class Mammal extends Animal {
	
	int milkPerDay; 
	
	Mammal() {
		System.out.println("Defult mammal is borns");
	}
	
	Mammal(String name){
		super(name); 
		System.out.println("Mammal with name is borns");
	}

}
