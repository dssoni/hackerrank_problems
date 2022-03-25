package hackerrank_problems;

public class LarrysArrayTwo {

	public static void main(String[] args) {

		System.out.println(larrysArray(new int[] { 1, 2, 3, 5, 4 }));

	}

	static String larrysArray(int[] A) {

		int cnt = 0;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] > A[i + 1]) {
				++cnt;
			}

		}

		if (cnt % 2 != 0) {
			return "YES";
		} else {
			return "NO";
		}

	}

}
