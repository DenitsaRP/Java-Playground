package oop.oopCarShop;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String personalNumber;
	
	Person(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 ) {
			System.out.println("The person has to be over 18 years old");
		} else {
			this.age = age;
		}
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (this.gender.equalsIgnoreCase("male") || this.gender.equalsIgnoreCase("female")) {
			this.gender = gender;
		} else {
			System.out.println("Invalid type gender");
		}

	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		if (this.personalNumber.length() == 10) {
			this.personalNumber = personalNumber;
		} else {
			System.out.println("Personal number have to be 10 digits length. You enter less ore more.");
			System.out.println("Please, try again!");
		}

	}

}
