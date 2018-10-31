package dataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		System.out.println("Original Collection: ");
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println("Shuffeled Collection: ");
		System.out.println(list);

	}

}
