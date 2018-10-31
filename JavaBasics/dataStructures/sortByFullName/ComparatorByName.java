package dataStructures.sortByFullName;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person>{

	@Override
	public int compare(Person pers1, Person pers2) {
		int comp = pers1.getFirstName().compareToIgnoreCase(pers2.getFirstName());
		if(comp == 0 ) {
			comp = pers2.getLastName().compareToIgnoreCase(pers2.getLastName());
			if(comp == 0 ) {
				comp = pers1.getAge() - pers2.getAge();
			}
		} 
		return comp;
		
	}
	
	

}
