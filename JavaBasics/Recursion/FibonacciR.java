package recursion;

public class FibonacciR {

	public static void main(String[] args) {
		int n = 13;
		int result = fib(n);
		System.out.println(result);
	}

	static int fib(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}
