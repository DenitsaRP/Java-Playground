package oopEmployeeAbstract;

public class AllWork {

	private Task[] tasks;
	private int freePlacesFortasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.freePlacesFortasks = 10;
		this.tasks = new Task[this.freePlacesFortasks];
		this.currentUnassignedTask = 0;
	}

	public Task[] getTask() {
		return tasks;
	}

	public void setTask(Task[] task) {
		this.tasks = task;
	}

	public int getFreePlacesFortasks() {
		return freePlacesFortasks;
	}

	public void setFreePlacesFortasks(int freePlacesFortasks) {
		this.freePlacesFortasks = freePlacesFortasks;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

	public void setCurrentUnassignedTask(int currentUnassignedTask) {
		this.currentUnassignedTask = currentUnassignedTask;
	}

	public Task[] addTask(Task[] taskS, Task newTask) {
		if (getFreePlacesFortasks() != 0) {
			newTask = taskS[getFreePlacesFortasks() - 1];
			setFreePlacesFortasks(freePlacesFortasks - 1);
		} else {
			System.out.println("There is no free spaces in task array");
		}
		return taskS;
	}

	public Task getNextTask() {
		if (getCurrentUnassignedTask() == tasks.length) {
			return null;
		}
		Task task = this.tasks[getCurrentUnassignedTask()];
		this.currentUnassignedTask++;
		return task;

	}

	public boolean isAllWorkDone(Task[] task) {
		boolean workDone = false;
		if (getFreePlacesFortasks() == task.length) {
			return workDone;
		} else {
			for (int i = 0; i < (task.length - getFreePlacesFortasks()); i++) {
				if (task[i].getWorkingHours() == 0) {
					workDone = true;
				} else {
					workDone = false;
					return workDone;
				}
			}
		}
		return workDone;
	}
}
