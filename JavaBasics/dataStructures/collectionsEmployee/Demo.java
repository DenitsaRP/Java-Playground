package dataStructures.collectionsEmployee;

public class Demo {

	public static void main(String[] args) {
		Company company = new Company("HedgeHod Online");
		
		Employee sasho = new Employee("Alexander", 27, 1000);
		Employee yana = new Employee("Yana", 23, 1200);
		Employee tanya = new Employee("Tanya", 28, 900);
		Employee gosho = new Employee("Georgy", 25, 1100);
		
		company.addEmployee("Logoistics", tanya);
		company.addEmployee("Logoistics", tanya);
		company.addEmployee("Sales", sasho);
		company.addEmployee("Sales", yana);
		company.addEmployee("IT", gosho);
		
		company.printEmplyees();
		System.out.println("------------------------------");
		company.printEmployeesSortedByName();
		System.out.println("------------------------------");
		company.printEmployeesSortedByAge();
		System.out.println("------------------------------");
		company.printEmployeesSortedBySalary();
	}

}
