package oop.softuniAnimal;

public class Tomcat extends Cat {

	public Tomcat(String name, int age, boolean isMale) throws Exception {
		super(name, age, isMale);
	}

	@Override
	protected String produceSound() {
		return "Miau miau";
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		String gender;
		if(this.isMale()) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		sb.append("Type: ").append(this.getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("Name: ").append(this.getName())
		.append(" ").append(this.getAge()).append(" ").append(gender)
		.append(System.lineSeparator())
		.append("Make sound: ").append(this.produceSound());
		return sb.toString();
	}
	
	
	
	
	

}
