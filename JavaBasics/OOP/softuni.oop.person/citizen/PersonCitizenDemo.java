package softuni.oop.person.citizen;

import java.util.Scanner;

public class PersonCitizenDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter ID number");
		String idNumber = sc.nextLine();
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		
		Citizen person = new Citizen(name, age, idNumber);
		System.out.println(person);
	}

}
