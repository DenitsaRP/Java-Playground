package oopPersonInheritance;

public class Person {

	String name;
	int age;
	boolean isMale;

	Person(String name, int age, boolean isMale) {
		
		this.name = name;
		if (age > 0 || age < 120) {
			this.age = age;
		} else {
			System.out.println("You have to enter positive number for age under 120");
		}
		this.isMale = isMale;

	}
	
	public void showPersonInfo() {
		System.out.println(this.name + " is " + this.age + " years old.");
		System.out.println("Is " + this.name + " male? - " + this.isMale);
	}

}
