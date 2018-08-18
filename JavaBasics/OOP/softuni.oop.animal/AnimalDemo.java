package softuni.oop.animal;

import java.util.Scanner;

public class AnimalDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Kitten cat = new Kitten("Matsa", 4, false);
		System.out.println(cat);
		
		System.out.println();
		Cat kotka = new Tomcat("Tom", 5, true);
		System.out.println(kotka);
		
		System.out.println();
		Frog frog = new Frog("Kermit", 2, true);
		System.out.println(frog);
		System.out.println();
		
		System.out.println("Enter Dogs's name: ");
		String dogsName = sc.nextLine();
		System.out.println("Enter Dogs's age: ");
		int dogsAge = sc.nextInt();
		System.out.println("Is dog male?");
		boolean isDogMale = sc.nextBoolean();
		Dog dog = new Dog(dogsName, dogsAge, isDogMale);
		System.out.println(dog);
		
		

	}

}
