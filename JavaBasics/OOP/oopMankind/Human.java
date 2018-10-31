package oop.oopMankind;

public class Human {

	private String firstName;
	private String lastName;

	public Human(String firstName, String lastName) throws Exception {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) throws Exception {
		this.firstName = validateName(firstName);
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) throws Exception {
		this.lastName = validateName(lastName);
	}

	private String validateName(String name) throws Exception {
		char ch = name.charAt(0);
		if (Character.isUpperCase(ch)) {
			if (name.length() > 4) {
				return name;
			} else {
				throw new Exception("Expected length at least 4 symbols!Argument: Name");
			}
		} else {
			throw new Exception("Expected upper case letter!Argument: Name");
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator())
				.append("First name: ").append(this.getFirstName()).append(System.lineSeparator()).append("Last name: ")
				.append(this.getLastName());
		return sb.toString();
	}

}
