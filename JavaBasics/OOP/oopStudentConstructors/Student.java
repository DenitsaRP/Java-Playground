package oop.oopStudentConstructors;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollage;
	int age;
	boolean isDegree;
	double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollage = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, int age, String subject) {
		this();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	void upYaer() {
		if (yearInCollage < 4) {
			yearInCollage++;
			System.out.println(this.name + " is " + yearInCollage + " years in collage.");
			if(yearInCollage == 4) {
				isDegree = true;
				System.out.println( this.name + " degree status is changed to " + isDegree);
			}
		}
	}
	
	double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return money;
	}
	
	

}
