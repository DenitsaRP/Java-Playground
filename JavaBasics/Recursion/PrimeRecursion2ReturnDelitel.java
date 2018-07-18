package recursion;

public class PrimeRecursion2ReturnDelitel {

	public static void main(String[] args) {

		int x = 53;
		boolean prosto = isPrime(x, 2);
		System.out.println(prosto);

	}

	static boolean isPrime(int x, int delitel) {
		if (delitel == x) {
			return true;
		}
		if (x % delitel == 0) {
			return false;
		}
		return isPrime(x, delitel + 1);
	}

}
