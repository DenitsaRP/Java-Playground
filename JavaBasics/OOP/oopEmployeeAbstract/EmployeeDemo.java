package oopEmployeeAbstract;

public class EmployeeDemo {

	public static void main(String[] args) {

		Task dràw = new Task("Dràw", 4);
		Task build = new Task("Build",220);
		Task sell = new Task("Sell",4);
		sell.setWorkingHours(12);
		Task clean = new Task("Clean", 7);
		
		Employee ivan = new Employee("Ivan");
		ivan.setCurrentTask(sell);
		ivan.setHoursLeft(5.5);
		Employee ina = new Employee("Ina");
		ina.setHoursLeft(6);
		ina.setCurrentTask(dràw);
		ina.setCurrentTask(sell);
		Employee rumen = new Employee("Rumen");
		rumen.setHoursLeft(7);
		rumen.setCurrentTask(build);
		Employee radka = new Employee("Radka");
		radka.setCurrentTask(clean);
		
		ivan.showReport();
		System.out.println();
		
		System.out.println();
		ina.showReport();
		
		System.out.println();
		rumen.showReport();
		
		System.out.println();
		radka.showReport();
	}

}
