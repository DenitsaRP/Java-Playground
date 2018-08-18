package oopEmployeeAbstract;

public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allWork;

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
		if (this.currentTask != null) {
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

	public AllWork getAllWork() {
		return allWork;
	}

	public void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}

	double startWorkingDay() {
		setHoursLeft(8);
		return getHoursLeft();
	}

	double work() {

		if (this.currentTask == null) {
			this.currentTask = this.getAllWork().getNextTask();
			if (this.getHoursLeft() > this.currentTask.getWorkingHours()) {
				this.setHoursLeft(getHoursLeft() - this.currentTask.getWorkingHours());
				this.getTask().setWorkingHours(0);
			} else if (this.getHoursLeft() < this.currentTask.getWorkingHours()) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
				this.setHoursLeft(0);
			}
		}
	

	}

	void showReport() {
		this.work();
		System.out.println("The employee name is " + this.name);
		System.out.println("The employee task is " + this.currentTask.getName());
		System.out.println(this.name + " has " + this.hoursLeft + "hours left for the day");
		System.out.println(this.name + " has " + this.currentTask.getWorkingHours() + " hours left to finish the task");
	}

}
