package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetSimpleSolutions {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Green");
		set.add("Pink");
		set.add("Orange");
		set.add("White");
		
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		for (Iterator<String> it = set.iterator(); it.hasNext();) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Size of the HashSet is: " + set.size());
		
		System.out.println();
		System.out.println("Let's colone original HashSet: ");
		HashSet<String> newSet = new HashSet<String>();
		 newSet = (HashSet<String>) set.clone();
		System.out.println("Checking if colone HashSet is empty or not -  "+ newSet.isEmpty());
		System.out.println("Elements: " + newSet);
		
		System.out.println();
		System.out.println("Convert a HashSet to an array and print: ");
		String[] array = new String[set.size()];
		set.toArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Convert a HashSet to treeSet and print: ");
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("New TreeSet: " + treeSet);
		System.out.println("Original HashSet: " + set);
		
		System.out.println();
		System.out.println("Convert a HashSet to ArrayList and print: ");
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println("New ArrayList: " + list);
		System.out.println("Original HashSet: " + set);
		
		System.out.println();
		System.out.println("Compare two HahSets, afetr changing colone one: ");
		newSet.remove("Green");
		newSet.add("Black");
		System.out.println(newSet);
		for (String element : set) {
			System.out.print(newSet.contains(element)? " Yes ": " No ");
		}
		
		System.out.println();
		System.out.println("Compare two sets and retain elements which are same on both sets: ");
		System.out.println("Set before compare: " + newSet);
		newSet.retainAll(set);
		System.out.println("Set after compare" + newSet);
		
		
		
		
		
	}
}
