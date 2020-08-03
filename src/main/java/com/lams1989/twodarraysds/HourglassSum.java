package com.lams1989.twodarraysds;

public class HourglassSum {

	public static int[] hourglassSum(int[][] a) {

		int[] sum = new int[16];
		for (int k = 0; k < sum.length;) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int hGlass = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
							+ a[i + 2][j + 2];
					sum[k] = hGlass;
					k++;
				}
			}
		}
		return sum;
	}

	public static int minHourGlass(int[] sum) {
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > min) {
				min = sum[i];
			}
		}
		return min;
	}
}
