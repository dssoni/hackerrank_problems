package hackerrank_problems;

import java.util.Arrays;

public class MarcCakeWalk {

	static long marcsCakewalk(int[] calorie) {

		long sum = 0;
		Arrays.sort(calorie);

		int j = calorie.length;
		for (int i : calorie) {
			sum = (long) (sum + Math.pow(2, --j) * i);
		}

		return sum;
	}

	public static void main(String args[]) {

		System.out.println(marcsCakewalk(new int[] { 7, 4, 9, 6 }));

	}

}
