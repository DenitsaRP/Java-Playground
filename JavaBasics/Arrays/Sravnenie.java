package arrays;

public class Sravnenie {

	public static void main(String[] args) {
		
		int [] array = {5, 6, 7, 8, 9};
		int [] array2 = {5, 6, 7, 8, 9};
		
		System.out.println(array);
		System.out.println(array2);
		
		System.out.println(array == array2);//показват разиченото местопложение в heap паментта
		boolean equal = true;
		if (array.length == array2.length) {
			for (int i = 0; i <array.length; i++) {
				if (array[i]!=array2[i]) {
					equal = false;
					break;
				}
			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Not equal");
		}
	}

}
