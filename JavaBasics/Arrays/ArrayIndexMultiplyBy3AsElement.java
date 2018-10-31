package arrays;

//Create an array with length of 10 elements. Each element is create by
//multiplying array index by 3. Print the array on the screen. 

public class ArrayIndexMultiplyBy3AsElement {

	public static void main(String[] args) {
		
		int array[] = new int [10];
		for (int i = 0; i <array.length; i++) {
			array[i] = i*3;
			System.out.print(array[i] + " ");
		}

	}

}
