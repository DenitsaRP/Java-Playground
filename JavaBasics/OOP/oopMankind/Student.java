package oop.oopMankind;

public class Student extends Human{
	
	private long facultyNumber;

	public Student(String firstName, String lastName, long  facultyNumber) throws Exception {
		super(firstName, lastName);
		this.setFacultyNumber(facultyNumber);
	}

	protected long getFacultyNumber() {
		return facultyNumber;
	}

	protected void setFacultyNumber(long facultyNumber) throws Exception {
		if(facultyNumber < 10000l || facultyNumber > 10000000000l) {
			throw new Exception("Invalid faculty number!");
		} else {
			this.facultyNumber = facultyNumber;
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("First name: ").append(this.getFirstName())
		.append(System.lineSeparator())
		.append("Last name: ").append(this.getLastName())
		.append(System.lineSeparator())
		.append("Faculty number: ").append(this.getFacultyNumber());
		return sb.toString();
	
	}

}
