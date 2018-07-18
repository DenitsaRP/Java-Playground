package recursion;

public class XNaStepenY {

	public static void main(String[] args) {
	
		int x = 4;
		int y = 3;
		int powerSum = power(x, y);
		System.out.println(powerSum);

	}
	
	static int power(int x, int y) {
		if( y == 0) {
			return 1;
		}
		if( y == 1) {
			return x;
		}
		return x*power(x, y-1);
	}

}
