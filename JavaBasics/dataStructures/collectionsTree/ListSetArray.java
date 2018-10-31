package dataStructures.collectionsTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetArray {

	public static void main(String[] args) {
		String[] strings = {"This is", "Text from", "Array."};
		for(int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
		System.out.println();
		
		ArrayList<String> text = new ArrayList<>();
		text.add("This is");
		text.add("Text from");
		text.add("ArrayList.");
		for (int i = 0; i < text.size(); i++) {
			System.out.print(text.get(i) + " ");
		}
		System.out.println();
		
		HashSet<String> textSet = new HashSet<>();
		textSet.add("This is");
		textSet.add("Text from");
		textSet.add("HashSet.");
		for (Iterator it = textSet.iterator(); it.hasNext();) {
			System.out.print(it.next() + " ");
			
		}
			}
}
