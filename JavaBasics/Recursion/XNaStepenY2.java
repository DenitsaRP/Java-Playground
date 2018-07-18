package recursion;

public class XNaStepenY2 {

	public static void main(String[] args) {
	
		int x = 2;
		int y = 10;
		int powerSum = power(x, y);
		System.out.println(powerSum);

	}
	
	static int sum (int x, int times) {
		if ( times == 1) {
			return x;
		}
		return x + sum(x, times - 1);
	}
	
	static int power(int x, int y) {
		if( y == 0) {
			return 1;
		}
		if( y == 1) {
			return x;
		}
		return sum(power(x, y-1), x);
	}

}
