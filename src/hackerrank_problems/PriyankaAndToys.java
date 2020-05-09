package hackerrank_problems;

import java.util.Arrays;

public class PriyankaAndToys {
	static int count = 0;

	static int toys(int[] w) {

		int limit = 0;
		Arrays.sort(w);

		for (int i = 0; i < w.length; i++) {
			limit = w[i] + 4;
			i = passcheck(limit, w, i) - 1;
			if (i == -1) {
				break;
			}
		}

		return count;

	}

	private static int passcheck(int limit, int[] w, int index) {
		++count;
		for (int i = index; i < w.length; i++) {
			if (w[i] > limit) {
				return i;
			}
		}

		return 0;
	}

	public static void main(String args[]) {

		System.out.println(toys(new int[] { 1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 15, 19 }));
	}

}
