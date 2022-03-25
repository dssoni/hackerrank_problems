package hackerrank_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingLeaderboard2021 {

	static List<Integer> result = new ArrayList<Integer>();
	static int j = 0;

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		// Write your code here
		ranked = ranked.stream().distinct().collect(Collectors.toList());
		// Collections.reverse(player);
		for (int i = 0; i < ranked.size() && j < player.size(); i++) {

			if (player.get(j) >= ranked.get(i)) {
				if (i != 0) {
					result.add(i + 1);
					++j;
					--i;
				} else {
					result.add(1);
					++j;
					--i;
					continue;
				}

			} else {
				if (i == ranked.size() - 1) {
					result.add(i + 2);
					++j;
					--i;
				}
				continue;
			}

		}
		Collections.reverse(result);
		for (int i : result) {
			System.out.println(i);
		}

		return result;
	}

	public static void main(String args[]) {
		List<Integer> ranked = new ArrayList<Integer>();
		ranked.add(53);
		ranked.add(52);
		List<Integer> player = new ArrayList<Integer>();
		player.add(44);
		player.add(43);
		player.add(42);

		climbingLeaderboard(ranked, player);
	}
}
