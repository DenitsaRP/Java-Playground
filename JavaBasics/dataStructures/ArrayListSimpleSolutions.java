package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSimpleSolutions {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Green");
		list.add("Pink");
		list.add("Orange");
		list.add("White");

		System.out.println("Array list elements: ");
		for (String listElement : list) {
			System.out.print(listElement + " ");
		}

		System.out.println();
		System.out.println("Insert an element into the array list at the first position:");
		list.add(0, "Black");
		System.out.println(list);

		System.out.println();
		System.out.println("Update specific element by given element: ");
		list.set(0, "Gray");
		System.out.println(list);

		System.out.println();
		System.out.println("Search an element in ArrayList:");
		if (list.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element!");
		}

		System.out.println();
		System.out.println("Sort a given ArrayList: ");
		System.out.println("List before sort: " + list);
		Collections.sort(list);
		System.out.println("List after sort: " + list);

		System.out.println();
		System.out.println("Extract a portion of ArrayList");
		List<String> extractedList = list.subList(2, 5);
		System.out.println("Original ArrayList: " + list);
		System.out.println("SubList: " + extractedList);

		System.out.println();
		System.out.println("Compare two array lists");
		extractedList.add(0, "Blue");
		extractedList.add(1, "Purple");
		extractedList.add(5, "Red");
		System.out.println("ArrayList for comparing: " + extractedList);
		System.out.println("Original ArrayList: "+ list);
		ArrayList<String> compareList = new ArrayList<String>();
		for (String element : list) {
			compareList.add(extractedList.contains(element) ? "Yes" : "No");
		}
		System.out.println(compareList);
		
		System.out.println();
		System.out.println("Swap two elements in an array list: ");
		System.out.println("ArrayList before swiping: " + list);
		Collections.swap(list, 0, 4);
		System.out.println("ArrayList after swiping: " + list);
		
		System.out.println();
		System.out.println("Join two array lists");
		ArrayList<String> bigList = new ArrayList<>();
		bigList.addAll(list);
		bigList.addAll(extractedList);
		System.out.println("The big ArrayList is: " + bigList);
		
		System.out.println();
		System.out.println("Clone an ArrayList to another ArrayList");
		System.out.println("Original ArrayList: " + list);
		ArrayList<String> colonList = (ArrayList<String>) list.clone();
		System.out.println("Colone ArrayList: " + colonList);
		
		System.out.println();
		System.out.println("Trim the capacity of an ArrayList the current list size");
		bigList.trimToSize();
		System.out.println(bigList);
		
		
	}

}
