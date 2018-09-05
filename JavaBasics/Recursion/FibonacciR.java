package recursion;

public class FibonacciR {

	public static void main(String[] args) {
		System.out.println(FibonacciR.isTelescopic(new [1]));
		System.out.println(FibonacciR.isTelescopic(new [1,1]));
		System.out.println(FibonacciR.isTelescopic(new [1,2,1]));
		System.out.println(FibonacciR.isTelescopic(new [1,2,2,1]));
		System.out.println(FibonacciR.isTelescopic(new [1,2,3,2,1]));
	}
	
	static boolean isTelescopic(int[] a) {
		if(a.length == 1 && a[0] == 1) {
			return true;
		}
		for(int i = 0; i < a.length/2; i++) {
			System.out.println(Math.ceil(a.length/2));
		}
	}
	
}
