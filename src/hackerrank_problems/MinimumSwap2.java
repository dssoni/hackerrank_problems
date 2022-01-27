package hackerrank_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwap2 {

	// static int[] gArr = null;

	public static void main(String args[]) {
		System.out.println(minimumSwaps(new int[] { 7, 1, 3, 2, 4, 5, 6 }));
	}

	static int minimumSwaps(int[] arr) {

		int swapCounter = 0, swapHelper = 0;
		;
		int[] sortedArray = arr.clone();
		Arrays.sort(sortedArray);
		Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

		// indexing..
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i] + " " + i);
			indexMap.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sortedArray[i]) {
				continue;
			} else {

				++swapCounter;

				swapHelper = arr[i];

				// update index first
				indexMap.put(arr[i], indexMap.get(sortedArray[i]));
				indexMap.put(arr[indexMap.get(sortedArray[i])], indexMap.get(swapHelper));

				// swap elements actual array

				arr[i] = sortedArray[i];
				arr[indexMap.get(sortedArray[i])] = swapHelper;

			}
		}

		return swapCounter;
	}

}
