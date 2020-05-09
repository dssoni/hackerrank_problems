package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingLeaderboardFailed {

	public static void main(String args[]) {

		climbingLeaderboard(new int[] { 100, 90, 90, 80, 75, 60 }, new int[] { 50, 65, 77, 90, 102 });
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int[] answer = new int[alice.length];

		List<Integer> list = new ArrayList<Integer>();

		for (int i : scores) {
			list.add(i);
		}

		for (int i = 0; i < alice.length; i++) {
			answer[i] = checkScoreForCurrentGame(list, alice[i]);
		}

		return answer;
	}

	static int checkScoreForCurrentGame(List<Integer> list, int alice) {

		list.add(alice);
		Collections.sort(list);

		Map<Integer, Integer> leaderboard = new HashMap<Integer, Integer>();
		int counter = 0;

		for (int i = list.size() - 1; i >= 0; i--) {

			if (!leaderboard.containsKey(list.get(i))) {
				leaderboard.put(list.get(i), ++counter);
			}

		}

		return leaderboard.get(alice);
	}

}
