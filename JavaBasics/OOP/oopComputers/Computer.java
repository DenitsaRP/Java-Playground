package oopComputers;

public class Computer {
	
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperrationSystem) {
		if (operationSystem.equals(newOperrationSystem)) {
			System.out.println("You already have " + operationSystem);
		} else {
			operationSystem = newOperrationSystem;
		}
	}
	
	void useMemory(int memory) {
		if ((freeMemory - memory) < 0 ) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}
}
