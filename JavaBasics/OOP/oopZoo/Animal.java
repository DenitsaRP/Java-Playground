package oopZoo;

public class Animal {
	
	String name;
	int age;
	
	Animal(){
		System.out.println("Defult animal is borns");
	}
	
	Animal(String name){
		this.name = name;
		System.out.println(" An animal is borns");
	}
	
	Animal(String name, int age){
		this(name);
		this.age = age;		
		System.out.println(" An animal is borns");
	}
	

}
