package sdataStructures.ortByFullName;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = verifyName(firstName);
		this.lastName = verifyName(lastName);
		setAge(age);
	}

	public String verifyName(String name) {
		if (name == null) {
			throw new NullPointerException("You have to enter name");
		} else if (name.matches(" [^\\w]")) {
			throw new IllegalArgumentException("You have to enter only lathin alphabets for name!");
		} 
		return name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("You have to enter positive number for age");
		}
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	

}
