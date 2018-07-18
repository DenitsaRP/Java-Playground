package recursion;

public class PrimeRecursion {

	public static void main(String[] args) {

		int x = 51;
		int delitel = isPrime(x, 2);
		System.out.println(delitel);

	}

	static int isPrime(int x, int delitel) {
		if (delitel == x) {
			return -1;
		}
		if (x % delitel == 0) {
			return delitel;
		}
		return isPrime(x, delitel + 1);
	}

}
