package hackerrank_problems;

import java.util.Arrays;

public class RunningMedianOptimized {

	public static void main(String args[]) {

		double[] answer = runningMedian(new int[] { 12, 4, 5, 3, 8, 7 });
		for (double a : answer) {
			System.out.println(a);
		}

	}

	static double[] runningMedian(int[] a) {

		double[] answer = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a, 0, i + 1);

			if ((i + 1) % 2 == 0) {
				answer[i] = (double) ((a[(i + 1) / 2] + a[((i + 1) / 2) - 1])) / 2;
			} else {
				answer[i] = (double) (a[((i + 1) - 1) / 2]);
			}

		}

		return answer;
	}

}
