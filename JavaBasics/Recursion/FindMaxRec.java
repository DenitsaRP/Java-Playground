package recursion;

public class FindMaxRec {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 5, 9, 7, 6, 3 };
		int max = findMax(arr, 0);
		System.out.println(max);
	}

	static int findMax(int[] array, int startIndex) {
		if (startIndex == array.length - 1 ) {
			return array[startIndex];
		}
		int maxOfrest = findMax(array, startIndex + 1);
		if (maxOfrest > array[startIndex]) {
			return maxOfrest;
		} else {
			return array[startIndex];
		}
	}

}
