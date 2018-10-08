package collectionsEmployee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Company {

	private String name;
	private HashMap<String, HashSet<Employee>> emps;// department -> list of employees

	public Company(String name) {
		emps = new HashMap<String, HashSet<Employee>>();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Phanom company";
		}
	}

	public void addEmployee(String department, Employee employee) {
		if (!emps.containsKey(department)) {
			emps.put(department, new HashSet<>());
		}
		emps.get(department).add(employee);
	}

	public void printEmplyees() {
		// for each department - print
		for (Iterator<Entry<String, HashSet<Employee>>> it = emps.entrySet().iterator(); it.hasNext();) {
			Entry<String, HashSet<Employee>> e = it.next();
			String department = e.getKey();
			HashSet<Employee> empsInDep = e.getValue();
			System.out.println("=====" + department + "=====");
			// for each employee in in this department
			for (Employee employee : empsInDep) {
				System.out.println(employee);

			}

		}
	}
	
	public Collection<Employee> returnWorkers(String department, List<Employee> employees) {
		// Opt 1: TreeSet<Employee> workers = new TreeSet<>(new ComparatorByName()); - No duplicate employees
		//Opt 2: 
		ArrayList<Employee> workers = new ArrayList<>();
		if(emps.containsKey(department)) {
			HashSet<Employee> empsInMyDep = emps.get(department);
			HashSet<Employee> cloneEmpsInMyDep = (HashSet<Employee>) empsInMyDep.clone();
			cloneEmpsInMyDep.retainAll(employees);
			workers.addAll(cloneEmpsInMyDep);
		}
		Collections.sort(workers, new ComparatorByName());//sorted and duplicate employees
		return workers;
	}

	void printEmployeesSortedBySalary() {
		// create comparator by salary
		printSoretdEmployees(new ComparatorBySalary());
	}

	void printEmployeesSortedByName() {
		printSoretdEmployees(new ComparatorByName());
		// create comparator by name

	}

	void printEmployeesSortedByAge() {
		printSoretdEmployees(new ComparatorByAge());
		// create comparator by age
	}

	private void printSoretdEmployees(Comparator<Employee> comp) {
		// create treeSet of Employees with comparator
		TreeSet<Employee> employees = new TreeSet<Employee>(comp);
		// traverse all employees from all department
		// add all emps in the new TreeSet
		for (Entry<String, HashSet<Employee>> e : emps.entrySet()) {
			employees.addAll(e.getValue());// instead of for loop
		/*	for (Employee emp : e.getValue()) {
				employees.add(emp);
			}*/
		}
		//print the treeSet
		for(Employee empl: employees) {
			System.out.println(empl);
		}
		
		
	}

}
