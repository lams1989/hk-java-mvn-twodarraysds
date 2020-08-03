package com.lams1989.twodarraysds;

import junit.framework.TestCase;

public class HourglassSumTest extends TestCase {

	public void testHourglassum() {
		int[][] arr = { { -9, -9, -9, 1, 1, 1 }, { 0, -9, 0, 4, 3, 2 }, { -9, -9, -9, 1, 2, 3 }, { 0, 0, 8, 6, 6, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[] expected = { -63, -34, -9, 12, -10, 0, 28, 23, -27, -11, -2, 10, 9, 17, 25, 18 };
		int[] actual = HourglassSum.hourglassSum(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(expected[i], actual[i]);
		}

	}
	
	public void testMiHourGlass() {
		int[] arr = { -63, -34, -9, 12, -10, 0, 28, 23, -27, -11, -2, 10, 9, 17, 25, 18 };
		int actual = HourglassSum.minHourGlass(arr);
		assertEquals(28, actual);
	}
}
