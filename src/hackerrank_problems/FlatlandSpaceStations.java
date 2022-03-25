package hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.lang3.ArrayUtils;

public class FlatlandSpaceStations {

	static int flatlandSpaceStations(int n, int[] c) {

		ArrayList<Integer> finalDistanceArr = new ArrayList<Integer>();

		// n: number of cities
		// m: number of space stations
		// c[]: indices of all the space stations; starting from 0.

		if (n == c.length) {
			return 0;
		}

		for (int i = 0; i < n; i++) {

			Integer[] tempArray = new Integer[c.length];

			// if (Arrays.asList(c).contains(i)) {

			if (ArrayUtils.contains(c, i)) {
				finalDistanceArr.add(0);
			} else {

				for (int j = 0; j < c.length; j++) {
					tempArray[j] = Math.abs(c[j] - i);
				}
				finalDistanceArr.add(Collections.min(Arrays.asList(tempArray)));

			}

		}
		System.out.println(Collections.max(finalDistanceArr));

		return Collections.max(finalDistanceArr);

	}

	public static void main(String[] args) {

		flatlandSpaceStations(5, new int[] { 0, 4 });

	}

}
