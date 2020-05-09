package hackerrank_problems;

import java.util.Arrays;

public class RunningMedian {

	public static void main(String args[]) {

		double[] answer = runningMedian(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		for (double a : answer) {
			System.out.println(a);
		}

	}

	static double[] runningMedian(int[] a) {

		double[] answer = new double[a.length];

		for (int i = 0; i < a.length; i++) {

			int[] tempArray = Arrays.copyOf(a, i + 1);

			Arrays.sort(tempArray);

			if (tempArray.length % 2 == 0) {
				answer[i] = (double) ((tempArray[tempArray.length / 2] + tempArray[(tempArray.length / 2) - 1])) / 2;
			} else {
				answer[i] = (double) (tempArray[(tempArray.length - 1) / 2]);
			}

			// answer[i] = findMedianForCurrentArray(tempArray);

		}

		return answer;

	}

}
