package oop.carSimple;

public class Person {

	String name;
	int age;
	double weight = 60;
	char gender = 'm';
	int height;
	long personalNumber;
	int arms = 2;
	Person friends;

	void eat(double foodWeight) {
		weight += foodWeight;
	}

	void growUp() {
		this.age++;
	}

	void sleep(int hours) {
		System.out.println(name + " is sleeping for " + hours + " hours");
		// name of the current object
	}

}
