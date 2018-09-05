package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TypesOfCollections {

	public static void main(String[] args) {

		System.out.println("LinkedList: ");
		LinkedList<String> lnkList = new LinkedList<String>();
		lnkList.add("element1");
		lnkList.add("element2");
		lnkList.add("element3");
		lnkList.add("element4");
		System.out.println(lnkList);

		System.out.println("ArrayList: ");
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("B");
		arrList.add("C");
		arrList.add("D");
		System.out.println(arrList);

		System.out.println("HashSet: ");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("four");
		System.out.println(hashSet);

		System.out.println("TreeSet: ");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("1");
		treeSet.add("2");
		treeSet.add("3");
		treeSet.add("4");
		System.out.println(treeSet);

		System.out.println("LinkedHashSet: ");
		LinkedHashSet<String> lnkHashSet = new LinkedHashSet<String>();
		lnkHashSet.add("Set1");
		lnkHashSet.add("Set2");
		lnkHashSet.add("Set3");
		lnkHashSet.add("Set4");
		System.out.println(lnkHashSet);

		System.out.println("HashMap: ");
		HashMap<Integer, String> hshMap = new HashMap<Integer, String>();
		hshMap.put(1, "Value 1");
		hshMap.put(2, "Value 2");
		hshMap.put(3, "Value 3");
		hshMap.put(4, "Value 4");
		System.out.println(hshMap);

		System.out.println("SortedMap: ");
		SortedMap<Integer, String> sortMap = new TreeMap<Integer, String>();
		sortMap.put(1, "green");
		sortMap.put(2, "blue");
		sortMap.put(3, "brown");
		sortMap.put(4, "white");
		System.out.println(sortMap);

		System.out.println("LinkedHashMap: ");
		LinkedHashMap<Integer, String> lnkHashMap = new LinkedHashMap<>();
		lnkHashMap.put(1, "dog");
		lnkHashMap.put(2, "cat");
		lnkHashMap.put(3, "rabbit");
		lnkHashMap.put(4, "hedgehog");
		System.out.println(lnkHashMap);
		System.out.println(lnkHashMap.keySet());
		System.out.println(lnkHashMap.values());

	}

}
