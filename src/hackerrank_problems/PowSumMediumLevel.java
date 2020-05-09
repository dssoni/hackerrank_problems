package hackerrank_problems;

public class PowSumMediumLevel {

	public static void main(String args[]) {

		System.out.println(powerSum(100, 2));
	}

	static int powerSum(int X, int N) {

		int counter = 0;
		boolean flag1 = true;

		for (int i = 10; i >= 1; i--) {

			if (checkPerfectMatch(i, X, N) && flag1) {
				flag1 = false;
				++counter;
			}
			if (X > Math.pow(i, N)) {

				if (checkPerfectMatch(i, (int) (X - Math.pow(i, N)), N)) {
					++counter;
				}

				for (int k = i; k >= 1; k--) {
					if (checkPerfectMatch(k, (int) (X - Math.pow(i, N)), N)) {
						++counter;
						break;
					}
				}

			}

		}

		System.out.println(counter);
		return 0;
	}

	static boolean checkPerfectMatch(int i, int x, int n) {

		if (x == (int) Math.pow(i, n)) {
			return true;
		}

		return false;

	}
}
