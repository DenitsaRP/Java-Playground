package oop.oopPersonInheritance;

public class Student extends Person {
	
	private double score;
	

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if(score >= 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("The score has to be between 2 and 6");
		}
	} 
	
	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println(this.name + " score in school is " + this.getScore());
	}


}
