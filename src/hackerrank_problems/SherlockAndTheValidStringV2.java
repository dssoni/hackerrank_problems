package hackerrank_problems;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidStringV2 {

	static final String YES = "YES";
	static final String NO = "NO";
	static Map<Character, Integer> cMap = new HashMap<Character, Integer>();

	public static void main(String args[]) {
		System.out.println(isValid("abbcc"));
	}

	public static String isValid(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (!cMap.containsKey(s.charAt(i))) {
				cMap.put(s.charAt(i), 1);
			} else {
				cMap.put(s.charAt(i), cMap.get(s.charAt(i)) + 1);
			}
		}

		int prevCount = 0;
		int currCount = 0;
		int mainCount = 0;
		int diff = 0;
		int counter = 0;
		boolean foundOneChar = false;
		boolean first = true;
		boolean foundFirstDiff = false;

		for (char c : cMap.keySet()) {

			if (first) {
				prevCount = cMap.get(c);
//				 currCount = cMap.get(c);
				first = false;
			} else {
				prevCount = currCount;
			}

			currCount = cMap.get(c);

			if (prevCount == currCount) {
				continue;
			} else if (prevCount != currCount) {
				++counter;
				if (diff != 0 && ((diff + currCount - prevCount) != 0)) {
					return NO;
				} else if (diff != 0 && ((diff + currCount - prevCount) == 0)) {

				} else {
					diff = currCount - prevCount;
				}
				if (diff == -1) {

				}
				continue;
			}

		}

		return NO;
	}
}
