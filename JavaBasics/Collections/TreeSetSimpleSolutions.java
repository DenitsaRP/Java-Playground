package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSimpleSolutions {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("R");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("D");
		treeSet.add("F");
		
		System.out.println(treeSet);
		//iterate through all elements
		for (Iterator<String> it = treeSet.iterator(); it.hasNext();) {
			String elem = it.next();
			System.out.print(elem + " ");
		}
		
		System.out.println();
		//add all the elements of a specified tree set to another tree set
		TreeSet<String> newTreeSet = new TreeSet<String>(treeSet);
		System.out.println(newTreeSet);
		
		System.out.println();
		//Java program to create a reverse order view of the elements contained in a given tree set.
		for (Iterator<String> it = newTreeSet.descendingIterator(); it.hasNext();) {
			String el = it.next();
			System.out.print(el + " ");	
		}
		System.out.println();
		// while()
		Iterator<String> it = newTreeSet.descendingIterator();{
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
		}
		System.out.println();
		// get the first and last elements in a tree set
		System.out.println("First element: " + treeSet.first());
		System.out.println("Last element: " + treeSet.last());
		
		//clone a tree set list to another tree set
		System.out.println();
		TreeSet<String> treeSetColone = new TreeSet<String>();
		treeSetColone = (TreeSet<String>) treeSet.clone();
		System.out.println("Colone TreeSet: " + treeSetColone);
		
		//get the number of elements in a tree set.
		System.out.println();
		System.out.println("Numbers of element in TreeSet: " + treeSet.size());
		
		
		//compare two tree sets
		System.out.println();
		for (String em : treeSet) {
			System.out.print(treeSetColone.contains(em)? " Yes " : " No ");
		}
		
		//find the numbers less than 7 in a tree set
		System.out.println();
		TreeSet<Integer> treeSetInt = new TreeSet<Integer>();
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		
		treeSetInt.add(1);
		treeSetInt.add(2);
		treeSetInt.add(3);
		treeSetInt.add(4);
		treeSetInt.add(5);
		treeSetInt.add(6);
		
		treeSet1 = (TreeSet<Integer>) treeSetInt.headSet(4);
		System.out.print(treeSet1 + " ");
		
		// get an element in a tree set which is strictly less than the given element
		System.out.println();
		System.out.println("Strictly less than 3 : " + treeSetInt.lower(3));
		
		//retrieve and remove the first element of a tree set
		System.out.println();
		System.out.println("Original tree set: "+ treeSetInt);
		System.out.println("Remove the first(lowest) element - " + treeSetInt.pollFirst());
		System.out.println("TreeSet after removing first element:" + treeSetInt);
	
		// remove the last element of a tree set
		System.out.println();
		System.out.println("Original tree set: "+ treeSetInt);
		System.out.println("Remove the last element - " + treeSetInt.pollLast());
		System.out.println("TreeSet after removing first element:" + treeSetInt);
	
	}

}
