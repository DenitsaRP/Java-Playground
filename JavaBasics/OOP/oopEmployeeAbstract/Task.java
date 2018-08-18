package oopEmployeeAbstract;

public class Task {
	
	private String name;
	private double workingHours;

	Task (String name, int workingHours){
		this.name = name;
		this.workingHours = workingHours;
	}
	
	public void setWorkingHours(double taskHoursLeft) {
		if (this.workingHours < 0) {
			System.out.println("Time cannot be negative number!");
		} else {
			this.workingHours = taskHoursLeft;
		}
	}
	
	public double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setName(String name) {
		if (this.name.isEmpty()) {
			System.out.println("You have to name the task");
		} else {
			this.name = name;
		}
	}
	
	public String getName() {
		return this.name;
	}
}
