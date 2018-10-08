package collectionsEmployee;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getAge() - emp2.getAge();
	}

}
