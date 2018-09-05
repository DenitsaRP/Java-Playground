package collections;

import java.util.ArrayList;

public class ConvertCollectionInToArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("This ");
		list.add("is ");
		list.add("an excellent ");
		list.add("exercises.");

		String[] array = list.toArray(new String[0]);
		for (int i = 0; i < array.length; i++) {
			String fill = array[i];
			System.out.print(fill);
		}
	}

}
