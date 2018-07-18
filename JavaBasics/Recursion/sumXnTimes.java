package recursion;

public class sumXnTimes {

	public static void main(String[] args) {
		int x = 4;
		int result = sum(x, 3);
		System.out.println(result);
	}

	static int sum(int x, int times) {
		if (times == 1) {
			return x;
		}
		return x + sum(x, times - 1);
	}
}
