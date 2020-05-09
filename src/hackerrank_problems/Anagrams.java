package hackerrank_problems;


public class Anagrams {

	public static void main(String args[]) {

		if (isAnagram("aawb", "aba")) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");

		}

	}

	static boolean isAnagram(String a, String b) {

		java.util.Map<Character, Integer> counterMapA = new java.util.HashMap<Character, Integer>();
		java.util.Map<Character, Integer> counterMapB = new java.util.HashMap<Character, Integer>();

		int tmpCounterA = 1, tmpCounterB = 1;

		if (a.length() == b.length()) {

			for (int i = 0; i < a.length(); i++) {
				tmpCounterA = 1;
				tmpCounterB = 1;

				if (counterMapA.get(Character.toLowerCase(a.charAt(i))) == null
						|| counterMapA.get(Character.toLowerCase(a.charAt(i))) == 0) {
					counterMapA.put(Character.toLowerCase(a.charAt(i)), tmpCounterA);
				} else {
					tmpCounterA = counterMapA.get(Character.toLowerCase(a.charAt(i)));
					counterMapA.put(Character.toLowerCase(a.charAt(i)), ++tmpCounterA);
				}

				if (counterMapB.get(Character.toLowerCase(b.charAt(i))) == null
						|| counterMapB.get(Character.toLowerCase(b.charAt(i))) == 0) {
					counterMapB.put(Character.toLowerCase(b.charAt(i)), tmpCounterB);
				} else {
					tmpCounterB = counterMapB.get(Character.toLowerCase(b.charAt(i)));
					counterMapB.put(Character.toLowerCase(b.charAt(i)), ++tmpCounterB);
				}

			}

			if (counterMapA.equals(counterMapB)) {
				return true;
			}

		}

		return false;
	}
}
