package oop.softuniChicken;

public class Chicken {

	private String name;
	private int age;

	public Chicken() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("You have to name the chicken.");
		} else if (name.charAt(0) == ' ') {
			System.out.println("The name of the chicken can't starts with spase");
		} else if (name.length() < 1) {
			System.out.println("Please enter name for the chicken at least 1 symbol long");
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0 || age > 15) {
			throw new Exception("Invalid age");
		} else {
			this.age = age;
		}
	}

	private void calculateProductPerDay() {
		if (this.getAge() <= 5) {
			System.out.println("Chicken " + this.getName() + " age - " + this.getAge() + " can produce 2 eggs per day.");
		} else if (this.getAge() >= 6 && this.getAge() <= 11) {
			System.out.println("Chicken " + this.getName() + " age - " + this.getAge() + " can produce 1 egg per day.");
		} else {
			System.out.println("Chicken " + this.getName() + " age - " + this.getAge() + " can produce 0.75 egg per day.");
		}
	}
	
	public void productPerDay() {
		calculateProductPerDay();
	}
	
	

}
