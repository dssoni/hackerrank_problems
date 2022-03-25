package hackerrank_problems;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

	public static void main(String args[]) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-10);
//		arr.add(-1);
//		arr.add(-1);
//		arr.add(-1);
//		arr.add(-1);
//		arr.add(5);

		System.out.println(maxSubarray(arr));
	}

	// implements Kadane's Algorithm
	public static List<Integer> maxSubarray(List<Integer> arr) {

		int maxSoFar = arr.get(0), maxEndingHere = arr.get(0), maxSubArray = 0;
		int l = 0, r = 0;
		boolean neverPositive = true, visited = false;

		for (int i = 1; i < arr.size(); i++) {

			if (arr.get(i) < (maxEndingHere + arr.get(i))) {
				maxEndingHere = maxEndingHere + arr.get(i);
			} else {
				maxEndingHere = arr.get(i);
				l = i;
				r = l;
			}
			if (maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
				r = i;
			}

			if (i == 1 && arr.get(i - 1) > 0) {
				maxSubArray = maxSubArray + arr.get(i - 1);
				neverPositive = false;
				visited = true;
			}
			if (arr.get(i) > 0) {
				maxSubArray = maxSubArray + arr.get(i);
				neverPositive = false;
				visited = true;
			}
			if (neverPositive && i == arr.size() - 1 && l == r) {
				maxSubArray = maxSoFar;
				visited = true;
			}

		}
		arr.clear();
		arr.add(maxSoFar);
		if (visited) {
			arr.add(maxSubArray);
		} else {
			arr.add(maxSoFar);
		}
		return arr;
	}
}
