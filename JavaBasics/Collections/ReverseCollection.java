package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseCollection {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("practice");
		myList.add("code");
		myList.add("example");
		myList.add("Collection reverse");

		System.out.println("Original List: " + myList);

		Collections.reverse(myList);
		System.out.println("Reversed List: " + myList);

	}

}
