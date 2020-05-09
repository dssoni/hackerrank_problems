package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solve {

	static int hourglassSum(int[][] arr) {

		// i = row || j = column

		int sum = 0;
		int maxSum = 0;
		List<Integer> finalSums = new ArrayList<Integer>();

		for (int iStartsWith = 0; iStartsWith < 4; iStartsWith++) {

			for (int jStartsWith = 0; jStartsWith < 4; jStartsWith++) {
				// one HOURGLASS loops...
				for (int i = iStartsWith; i < iStartsWith + 3; i++) {

					for (int j = jStartsWith; j < jStartsWith + 3; j++) {

						if (i == iStartsWith + 1) {

							if (j == jStartsWith + 1) {
								sum = sum + arr[i][j];
							}

						} else {
							sum = sum + arr[i][j];
						}

					}

				}
				// till here
				finalSums.add(sum);
				sum = 0;
			}

		}

		
		
		maxSum = Collections.max(finalSums);
		
		
		
		return maxSum;
	}

	public static void main(String args[]) {

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

		System.out.println(hourglassSum(arr));

	}

}
