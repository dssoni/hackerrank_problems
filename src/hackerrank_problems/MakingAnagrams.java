package hackerrank_problems;

import java.util.Map;
import java.util.HashMap;

public class MakingAnagrams {

	public static void main(String args[]) {

		System.out.println(makeAnagram("cde", "abc"));

	}

	static int makeAnagram(String a, String b) {

		Map<Character, Integer> counterMapA = new HashMap<Character, Integer>();
		Map<Character, Integer> counterMapB = new HashMap<Character, Integer>();

		int finalCounter = 0;
		int tmpCounterA = 1, tmpCounterB = 1;

		for (int i = 0; i < a.length(); i++) {

			if (counterMapA.containsKey(a.charAt(i))) {

				tmpCounterA = counterMapA.get(a.charAt(i));
				counterMapA.put(a.charAt(i), ++tmpCounterA);

			} else {
				counterMapA.put(a.charAt(i), tmpCounterA);
			}

			tmpCounterA = 1;
		}

		for (int i = 0; i < b.length(); i++) {

			if (counterMapB.containsKey(b.charAt(i))) {

				tmpCounterB = counterMapB.get(b.charAt(i));
				counterMapB.put(b.charAt(i), ++tmpCounterB);

			} else {
				counterMapB.put(b.charAt(i), tmpCounterB);
			}

			tmpCounterB = 1;

		}

		for (Character c : counterMapA.keySet()) {
			if (!counterMapB.containsKey(c)) {
				finalCounter = finalCounter + counterMapA.get(c);
			} else {
				if (!counterMapA.get(c).equals(counterMapB.get(c))) {
					finalCounter = finalCounter + Math.abs(counterMapA.get(c) - counterMapB.get(c));

				}
			}
		}

		for (Character c : counterMapB.keySet()) {
			if (!counterMapA.containsKey(c)) {
				finalCounter = finalCounter + counterMapB.get(c);
			}
		}

		return finalCounter;
	}

}
