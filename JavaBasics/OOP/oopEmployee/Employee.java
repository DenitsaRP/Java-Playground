package oopEmployee;

public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;

	public Employee(String name) {
		this.name = name;
	}

	public void setName(String name) {
		if (this.name.isEmpty()) {
			System.out.println("You have to enter name for the employee!");
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return this.name;
	}
	
	public void setCurrentTask(Task currentTask) {
		if(this.currentTask != null) {
			System.out.println("There is a task for the employee " + this.name + " - " + this.currentTask.getName());
		} else {
			this.currentTask = currentTask;
		}
	}
	
	public Task getTask() {
		return this.currentTask;
	}

	public void setHoursLeft(double hoursLeft) {
		if (this.hoursLeft < 0) {
			System.out.println("You have to enter positive number for time!");
		} else {
			this.hoursLeft = hoursLeft;
		}
	}

	public double getHoursLeft() {
		return this.hoursLeft;
	}

	double work() {
		if (this.currentTask != null) {
			if (this.hoursLeft < this.currentTask.getWorkingHours()) {
				double taskHoursLeft = this.currentTask.getWorkingHours() - this.hoursLeft;
				this.currentTask.setWorkingHours(taskHoursLeft);
				setHoursLeft(0);
			} else if(this.hoursLeft > this.currentTask.getWorkingHours()){				
				double workingHoursLeft = this.hoursLeft - this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				setHoursLeft(workingHoursLeft);
			}
		} else {
			setHoursLeft(0);
		}
		return getHoursLeft();
	}
	
	void showReport() {
		this.work();
		System.out.println("The employee name is " + this.name);
		System.out.println("The employee task is " + this.currentTask.getName());
		System.out.println(this.name + " has " + this.hoursLeft + "hours left for the day");
		System.out.println(this.name + " has " + this.currentTask.getWorkingHours() + " hours left to finish the task");
	}
}
