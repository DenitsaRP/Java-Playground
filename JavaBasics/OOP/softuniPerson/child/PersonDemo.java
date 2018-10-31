package oop.softuniPerson.child;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Person lili = new Person("Lilly", 25);
		System.out.println(lili);
		
		Person marko = new Person("Marko", 66);
		System.out.println(marko);
		
		Child gosho = new Child("Gosho ", 14);
		System.out.println(gosho);
		
		System.out.println("Enter person's name: ");		
		String name = sc.nextLine();
		
		System.out.println("Enter person's age");
		//int age = sc.nextInt();
		int age = Integer.valueOf(sc.nextLine());
		
		Person person = new Person(name, age);
		System.out.println(person);
		
		

	}

}
