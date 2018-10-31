package dataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

public class ArrayListMaxMinElementReplacecElementRotateElement {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one two three four five six".split(" "));
		System.out.println("List: " + list);
		//MAX and MIN element
		System.out.println("MAX element: " + Collections.max(list));
		System.out.println("MIN element: " + Collections.min(list));
		
		//replace element
		Collections.replaceAll(list, "one", "nine");
		System.out.println("list with replaced element: " + list);
		
		//rotate element
		Collections.rotate(list, 3);
		System.out.println("List with rotated element: " + list);
	}

}
