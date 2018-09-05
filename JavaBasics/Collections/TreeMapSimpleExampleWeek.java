package collections;

import java.util.Scanner;
import java.util.TreeMap;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class TreeMapSimpleExampleWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tree Map simple example: ");
		TreeMap<Integer, String> week = new TreeMap<Integer, String>();
		week.put(1, "Monday");
		week.put(2, "Tuesday");
		week.put(3, "Wednesday");
		week.put(4, "Thursday");
		week.put(5, "Friday");
		week.put(6, "Saturday");
		week.put(7, "Sunday");

		System.out.println("Keys of the Tree Map: " + week.keySet());
		System.out.println("Values of the Tree Map: " + week.values());
		System.out.println("Key 6 value is: " + week.get(6));
		System.out.println("Please, choose day from the week in Integer form: ");
		int dayOfWeek = sc.nextInt();
		while (dayOfWeek < 1 || dayOfWeek > 7) {
			System.out.println("Please enter number between 1 and 7: ");
			dayOfWeek = sc.nextInt();
		}
		System.out.println("You choose Key " + dayOfWeek + ", and the value is: " + week.get(dayOfWeek));
		System.out.println("First key: " + week.firstKey() + " value is: " + week.get(week.firstKey()));
		System.out.println("Last key: " + week.lastKey() + " value is " + week.get(week.lastKey()));
		System.out.println("Remove first data: " + week.remove(week.firstKey()));
		System.out.println("Now, the Tree Map keys: " + week.keySet());
		System.out.println("Now, the Tree Map contains " + week.values());
		System.out.println("Remove last data: " + week.remove(week.lastKey()));
		System.out.println("Now, the tree Map keys are: " + week.keySet());
		System.out.println("Now, the Tree Map values are:  " + week.values());
	}

}
