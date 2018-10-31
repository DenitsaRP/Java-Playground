package dataStructures;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionAnimalsIterator {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();
		animals.add("fox");
		animals.add("wolf");
		animals.add("rabbit");
		animals.add("bear");

		java.util.Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);

			if (value.equals("rabbit")) {
				it.remove();
			}
		}
		System.out.println("****************");
		for (String animal : animals) {
			System.out.println(animal);
		}
	}

}
