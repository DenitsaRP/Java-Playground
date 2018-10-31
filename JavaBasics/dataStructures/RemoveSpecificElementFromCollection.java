package dataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveSpecificElementFromCollection {

	public static void main(String[] args) {

		HashSet<String> setCollection = new HashSet<String>();
		String str1 = "Yellow";
		String str2 = "White";
		String str3 = "Green";
		String str4 = "Blue";
		Iterator it;
		setCollection.add(str1);
		setCollection.add(str2);
		setCollection.add(str3);
		setCollection.add(str4);
		System.out.println("Collection data: ");
		it = setCollection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

		System.out.println();
		setCollection.remove(str2);
		System.out.println("After rmoving " + str2 + ":");
		System.out.println("Now collection data: ");
		it = setCollection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
		}

		System.out.println();
		System.out.println("Collection size: " + setCollection.size());

	}

}
