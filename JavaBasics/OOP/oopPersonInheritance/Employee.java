package oopPersonInheritance;

public class Employee extends Person{
	
	private double daySalary;

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if(this.age < 18) {
			daySalary = 0;
		} else {
			this.daySalary = daySalary;
		}
	}
	
	public double calculteOvertime(double hours) {
		double pricePerHouer = (this.getDaySalary())/8;
		double overtime = 0;
		if(this.age > 18 ) {
			overtime = hours*1.5 *pricePerHouer;
		}
		return overtime;
	}

	@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println(this.name + " day salary is " + this.getDaySalary() + "lv");
	}
	
	
}
