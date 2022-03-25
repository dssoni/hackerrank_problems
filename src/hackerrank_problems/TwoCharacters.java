package hackerrank_problems;

import java.util.HashMap;
import java.util.Map;

public class TwoCharacters {

	static Map<HashMap<Character, Character>, Integer> uniPairCounts = new HashMap<HashMap<Character, Character>, Integer>();
	static Map<Character, Character> uniPairs = new HashMap<Character, Character>();

	public static int alternate(String s) {
		// Write your code here

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		// count all characters
		for (int i = 0; i < s.length(); i++) {

			if (!charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i), 0);

				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						// System.out.println(s.charAt(i));
						charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
						// System.out.println(charMap.get(s.charAt(i)));
					}
				}
			}
		}

		// making all unique pairs!
		for (int i = 0; i < s.length() - 1; i++) {
			// for (int j = i + 1; j < s.length(); j++) {

			findOccurence(s.charAt(i), s.charAt(i + 1));
			// }
		}

		// printing UniPairs
		System.out.println("++++++printing UniPairs");

		for (Character c : uniPairs.keySet()) {
			System.out.println(c + " and " + uniPairs.get(c) + " is a pair!");
		}

		// printing hashmap!
		for (Character c : charMap.keySet()) {
			System.out.println(c + "  char and " + charMap.get(c));
		}

		return 0;

	}

	private static void findOccurence(char c1, char c2) {
		System.out.println("in emthod: " + c1 + " and " + c2);
		if (c1 != c2) {
			if (!uniPairs.containsKey(c1)) {
				System.out.println("pairs must be: " + c1 + " and " + c2);

				uniPairs.put(c1, c2);
			}

			if (uniPairs.containsKey(c1) && uniPairs.get(c1) != c2) {
				System.out.println("pairs must be: " + c1 + " and " + c2);

				uniPairs.put(c1, c2);
			}
		}

	}

	public static void main(String args[]) {

		System.out.println(alternate("beabeefeab"));

	}

}
