package cloudera;

import java.io.ObjectInputStream.GetField;

public class Problem1 {
	static int max1 = 0;
	static int max2 = 0;
	static int max3 = 0;
	static int negativecnt = 0;
	public static void main(String[] args) {
		int a[] = { 0, 1, 3, 100, -70, 5 };

		for (int i = 0; i < a.length; i++) {
			if (Math.abs(max1) < Math.abs(a[i])) {

				max2 = max1;
				max1 = a[i];
			}
			if (Math.abs(a[i]) < Math.abs(max1)) {
				if (Math.abs(max2) < Math.abs(a[i])) {
					max3 = max2;

					max2 = a[i];
				}
				if (Math.abs(a[i]) < Math.abs(max2)) {
					if (Math.abs(max3) < Math.abs(a[i])) {
						max3 = a[i];
					}
				}
			}
		}
		negativecnt = 0;
		if (max1 < 0)
			negativecnt++;
		if (max2 < 0)
			negativecnt++;
		if (max3 < 0)
			negativecnt++;
		// System.out.println(negativecnt+"Two no are:" + max1 + "," + max2 +
		// "," + max3+ "\n Product:" + max1 * max2 * max3);

		if (negativecnt == 3) {
			int max = findMax(a, 0, 0);
			max3 = max;
		} else if (negativecnt == 1) {
			int max;
			if (max1 < 0) {
				max = findMax(a, max2, max3);
				max1 = max;
			} else if (max2 < 0) {
				max = findMax(a, max1, max3);
				max2 = max;
			} else {
				max = findMax(a, max1, max2);
				max3 = max;
			}
		}

		System.out.println("Three no are:" + max1 + "," + max2 + "," + max3
				+ "\n Product:" + max1 * max2 * max3);
	}
	static int findMax(int a[], int exclude1, int exclude2) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max && a[i] != exclude1 && a[i] != exclude2)
				max = a[i];
		}
		return max;
	}

	int[] FindHighestTwo() {
		int[] b = new int[2];

		return b;

	}
}
