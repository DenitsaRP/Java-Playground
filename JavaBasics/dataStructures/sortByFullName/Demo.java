package dataStructures.sortByFullName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("Asen", "Ivanov", 25));
		list.add(new Person("Boiko", "Boikov",  26));
		list.add(new Person("Velislav", "Atanasv", 21));
		list.add(new Person("Asen", "Ivanov", 22));
		list.add(new Person("Vili", "Atanasova", 22));
		
		
		Collections.sort(list, new ComparatorByName());
		for(Person person: list) {
			System.out.println(person.getFirstName() + " " + person.getLastName()  + " " + person.getAge());
		}
			

	}

}
