package recursion;

public class SumNumberRec {

	public static void main(String[] args) {

		int n = 8;
		int totalSum = sum(n);
		System.out.println(totalSum);
	}

	static int sum(int n) {
		if (n <= 1) {
			return n;
		}
		return n + sum(n - 1);
	}
}
