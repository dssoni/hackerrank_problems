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
//		ranked.add(51);
//		ranked.add(50);
//		ranked.add(957);
//		ranked.add(937);
//		ranked.add(930);
//		ranked.add(929);
//		ranked.add(928);
//		ranked.add(927);
//		ranked.add(926);
//		ranked.add(922);
//		ranked.add(920);
//		ranked.add(916);
		List<Integer> player = new ArrayList<Integer>();
		player.add(44);
		player.add(43);
		player.add(42);
//		player.add(918);
//		player.add(905);

		climbingLeaderboard(ranked, player);
	}
}

//
//public class ClimbingLeaderboard2021 {
//
//	// int index = 0;
////	static boolean flag = false;
//	static List<Integer> result = new ArrayList<Integer>();
//	Map<Integer, Integer> ranks = new HashMap<Integer, Integer>();
//
//	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//		// Write your code here
//		ranked = ranked.stream().distinct().collect(Collectors.toList());
//		System.out.println("ranked");
//		for (int i : ranked) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
//		System.out.println("\nplayer");
//		for (int i : player) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
//		System.out.println("");
//		for (int i = 0; i < player.size(); i++) {
//			if (ranked.contains(player.get(i))) {
//				result.add(ranked.indexOf(player.get(i)) + 1);
//				System.out
//						.println("result index for: " + player.get(i) + " is: " + (ranked.indexOf(player.get(i)) + 1));
//			} else {
//				ranked.add(player.get(i));
//				Collections.sort(ranked);
//				Collections.reverse(ranked);
//				result.add(ranked.indexOf(player.get(i)) + 1);
//				System.out
//						.println("result index for: " + player.get(i) + " is: " + (ranked.indexOf(player.get(i)) + 1));
//				ranked.remove(player.get(i));
//			}
//
//			System.out.println("index of: " + player.get(i) + " is - " + ranked.indexOf(player.get(i)));
//		}
//
//		System.out.println("ranked + player");
//		for (int i : ranked) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
//
//		return result;
//	}
//
//	public static void main(String args[]) {
//		List<Integer> ranked = new ArrayList<Integer>();
//		ranked.add(100);
//		ranked.add(90);
//		ranked.add(90);
//		ranked.add(80);
//		ranked.add(75);
//		ranked.add(60);
////		ranked.add(20);
////		ranked.add(10);
//		List<Integer> player = new ArrayList<Integer>();
//		player.add(50);
//		player.add(65);
//		player.add(77);
//		player.add(90);
//		player.add(102);
//
//		climbingLeaderboard(ranked, player);
//	}
//}
