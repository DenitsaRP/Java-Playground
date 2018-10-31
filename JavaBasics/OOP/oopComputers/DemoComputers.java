package oop.oopComputers;

public class DemoComputers {

	public static void main(String[] args) {
		
		Computer lenovo = new Computer();
		lenovo.year = 2016;
		lenovo.price = 2150.50;
		lenovo.isNotebook = true;
		lenovo.hardDiskMemory = 500;
		lenovo.freeMemory = 250;
		lenovo.operationSystem = "Windows 10";
		
		System.out.println("Your computer is manufactured in " + lenovo.year);
		System.out.println("Computer prisce is: " + lenovo.price + "lv");
		System.out.println("Is it Notebook? " + lenovo.isNotebook);
		System.out.println("How much hard disk space do you have? - " + lenovo.hardDiskMemory + "GB");
		System.out.println("how much free hard disk space do you have? - " + lenovo.freeMemory + "GB");
		System.out.println("What is computers's operation system? -" + lenovo.operationSystem);
		System.out.println("Use 100GB from your free memory: ");
		lenovo.useMemory(100);
		System.out.println("Now, you have " + lenovo.freeMemory + "GB free hard disk space.");
		System.out.println();
		
		Computer hp = new Computer();
		hp.year = 2014;
		hp.price = 1100;
		hp.isNotebook = false;
		hp.hardDiskMemory = 1000;
		hp.freeMemory = 150;
		hp.operationSystem = "Linux";
		System.out.println("Your computer is manufactured in " + hp.year);
		System.out.println("Computer prisce is: " + hp.price + "lv");
		System.out.println("Is it Notebook? " + hp.isNotebook);
		System.out.println("How much hard disk space do you have? - " + hp.hardDiskMemory + "GB");
		System.out.println("how much free hard disk space do you have? - " + hp.freeMemory + "GB");
		System.out.println("What is computers's operation system? -" + hp.operationSystem);
		System.out.println("Please, change your operation system to Windows 10.");
		hp.changeOperationSystem("Windows 10");
		System.out.println("Now, your operation system is " + hp.operationSystem );
		

	}

}
