package hackerrank_problems;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
		int hi = 0, lo = 0, cH = 0, cL = 0;

		for (int i = 0; i < scores.length; i++) {
			if (i == 0) {
				hi = scores[i];
				lo = scores[i];
			} else if (scores[i] > hi) {
				hi = scores[i];
				++cH;
			} else if (scores[i] < lo) {
				lo = scores[i];
				++cL;
			}
		}

		return new int[] { cH, cL };
	}

	public static void main(String args[]) {

		int[] ans = breakingRecords(new int[] { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 });

		for (int i : ans) {
			System.out.println(i);
		}

	}

}
