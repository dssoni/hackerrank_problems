package hackerrank_problems;

public class AppleOrange {

	public static void main(String args[]) {

		countApplesAndOranges(7, 10, 4, 12, new int[] { 2, 3, -4 }, new int[] { 3, -2, -4 });

	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int countApple = 0, countOrange = 0;

		for (int i : apples) {
			if (i + a >= s && i + a <= t) {
				++countApple;
			}
		}

		for (int i : oranges) {
			if (i + b >= s && i + b <= t) {
				++countOrange;
			}
		}

		System.out.println(countApple + " " + countOrange);

	}

}
