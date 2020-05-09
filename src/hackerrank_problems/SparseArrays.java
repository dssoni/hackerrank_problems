package hackerrank_problems;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {

		List<Integer> answer = new ArrayList<Integer>();
		for (String query : queries) {

			answer.add(findOccurences(query, strings));

		}

		int[] finalAnswer = new int[answer.size()];
		for (int i = 0; i < answer.size(); i++) {
			finalAnswer[i] = answer.get(i);
		}
		System.out.println(answer);

		return finalAnswer;
	}

	private static int findOccurences(String query, String[] strings) {

		int counter = 0;

		for (String str : strings) {

			if (str.equals(query)) {
				++counter;
			}

		}

		return counter;
	}

	public static void main(String args[]) {

		matchingStrings(new String[] { "ab", "ab", "abc" }, new String[] { "ab", "abc", "bc" });

	}
}
