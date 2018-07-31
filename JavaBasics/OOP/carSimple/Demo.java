package oop.carSimple;

public class Demo {

	public static void main(String[] args) {

		int x = 5;
		Person pesho = new Person();
		pesho.age = 6;
		
		Person gosho = new Person();
		gosho.age = 14;
		
		System.out.println("Pesho is " + pesho.age + " years old");
		System.out.println("Gosho is  " + gosho.age + " years old");
		System.out.println(pesho);
		System.out.println(gosho);
	}

}
