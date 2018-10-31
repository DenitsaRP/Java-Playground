package oop.softuniPerson.citizen;

public class Citizen implements Person, Identifiable {
	
	private String name;
	private int age;
	private String idNumber;
	private String birthdayDate;
	
	
	public Citizen(String name, int age, String idNumber) throws Exception {
		setName(name);
		setAge(age);
		setId(idNumber);
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
	

	protected String getIdNumber() {
		return idNumber;
	}


	protected void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	protected String getBirthdayDate() {
		return birthdayDate;
	}


	@Override
	public void setName(String name) throws Exception {
		if(name.length() < 3) {
			throw new Exception("The name should be at least 3 simbols long");
		} else {
			this.name = name;
		}
		
	}

	@Override
	public void setAge(int age) throws Exception {
		if(age < 0) {
			throw new Exception("Age shuld be positive number");
		} else {
			this.age = age;
		}
	}

	@Override
	public void setId(String idNumber) throws Exception {
		if(idNumber.length() == 10) {
			if(idNumber.matches(".*\\d+.*")) {
				this.idNumber = idNumber;
			} else {
				throw new Exception("ID number contains only digits");
			}
		} else {
			throw new Exception("ID number has to be exactly 10 digits long");
		}
		
	}

		
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("Name: ").append(this.getName())
		.append(System.lineSeparator())
		.append("Age: ").append(this.getAge())
		.append(System.lineSeparator())
		.append("ID: ").append(this.getIdNumber());
		return sb.toString();
	}
	

}
