package hackerrank_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class LarrysArray {

	static ArrayList<int[]> mainCopy = new ArrayList<int[]>();

	public static void main(String[] args) {

		System.out.println(larrysArray(new int[] { 1, 3, 4, 2 }));
		mainCopy.clear();

	}

	static String larrysArray(int[] A) {

		for (int i = 0; i < A.length; i++) {

			int[] copyA = Arrays.copyOf(A, A.length);
			Arrays.sort(copyA);

			if (Arrays.equals(A, copyA)) {
				return "YES";
			}

			if (i + 1 < A.length && A[i] > A[i + 1]) {

				mainCopy.add(Arrays.copyOf(A, A.length));

				int tmp = 0;

				if (A.length - i < 3) {

					tmp = A[i - 1];
					A[i - 1] = A[i];
					A[i] = A[i + 1];
					A[i + 1] = tmp;

				} else {

					tmp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = A[i + 2];
					A[i + 2] = tmp;

				}

				if (mainCopy.size() > 1) {
					for (int[] h : mainCopy) {
						if (Arrays.equals(h, A)) {
							return "NO";
						}
					}
				}

				if (mainCopy.size() > 1 && mainCopy.contains(A)) {
					return "NO";
				}
				i = -1;
			}

		}
		int[] copyA1 = Arrays.copyOf(A, A.length);
		Arrays.sort(copyA1);

		if (Arrays.equals(A, copyA1)) {
			return "YES";
		}

		return "NO";
	}

}
