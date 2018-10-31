package oop.oopMankind;

public class Worker extends Human {

	private double weekSalary;
	private double workingHoursPerDay;

	public Worker(String firstName, String lastName, double weekSalary, double workingHoursPerDay) throws Exception {
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setWorkingHoursPerDay(workingHoursPerDay);

	}

	protected double getWeekSalary() {
		return weekSalary;
	}

	protected void setWeekSalary(double weekSalary) throws Exception {
		if (weekSalary < 10) {
			throw new Exception("Expected value mismatch!Argument: weekSalary");
		} else {
			this.weekSalary = weekSalary;
		}

	}

	protected double getWorkingHoursPerDay() {
		return workingHoursPerDay;
	}

	protected void setWorkingHoursPerDay(double workingHoursPerDay) throws Exception {
		if (workingHoursPerDay < 1 || workingHoursPerDay > 12) {
			throw new Exception("Expected value mismatch!Argument: workHoursPerDay");
		} else {
			this.workingHoursPerDay = workingHoursPerDay;
		}
	}
	
	private double calculateSalaryPerHour() {
		return (this.getWeekSalary()/5)/this.getWorkingHoursPerDay();
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
		.append("Week Salary: ").append(this.getWeekSalary())
		.append(System.lineSeparator())
		.append("Houers per day: ").append(this.getWorkingHoursPerDay())
		.append(System.lineSeparator())
		.append("Salary per hour: ").append(this.calculateSalaryPerHour());
		
		return sb.toString();
	}
	
	

}
