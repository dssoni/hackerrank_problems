package hackerrank_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClimbingLeaderboardMain {

	public static void main(String args[]) {

		climbingLeaderboard(new int[] { 100, 100, 50, 40, 40, 20, 10 }, new int[] { 5, 25, 50, 120 });
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int[] answer = new int[alice.length];
		int[] arrList = Arrays.copyOf(scores, scores.length + 1);

		for (int i = 0; i < alice.length; i++) {

			arrList[arrList.length - 1] = alice[i];
			Arrays.sort(arrList);

			Map<Integer, Integer> leaderboard = new HashMap<Integer, Integer>();
			int counter = 0;

			for (int j = arrList.length - 1; j >= 0; j--) {

				if (!leaderboard.containsKey(arrList[j])) {
					leaderboard.put(arrList[j], ++counter);
				}

			}

			answer[i] = leaderboard.get(alice[i]);
			System.out.println(answer[i]);
			arrList = Arrays.copyOf(scores, scores.length + 1);
		}

		return answer;
	}

}
