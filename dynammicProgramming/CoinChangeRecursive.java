package dynammicProgramming;

public class CoinChangeRecursive {

	public static void main(String[] args) {
		int [] coins = {1,2, 3};
		System.out.println(total(5, coins, 0));
	}
	
	public static int total(int n, int[] v, int i) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		// means coins over and n>0 so no solution
		if (i == v.length && n > 0) {
			return 0;
		}
		return total(n - v[i], v, i) + total(n, v, i + 1);
	}

}
