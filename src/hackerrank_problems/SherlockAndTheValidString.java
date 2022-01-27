package hackerrank_problems;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {

	static final String YES = "YES";
	static final String NO = "NO";
	static Map<Character, Integer> cMap = new HashMap<Character, Integer>();

	public static void main(String args[]) {
		System.out.println(isValid("abbccc"));
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
		int thisCount = 0;
		int diff = 0;
		boolean oneCharFound = false;
		boolean first = true;
		boolean oneTimeFlag = true;

		for (char c : cMap.keySet()) {
			if (first) {
				prevCount = cMap.get(c);
				thisCount = cMap.get(c);
				first = false;
			} else {
				prevCount = thisCount;
				thisCount = cMap.get(c);
			}

			if (prevCount == thisCount && diff > -1) {
				continue;
			} else if (prevCount == thisCount && diff < 0) {
				return NO;
			} else if (oneTimeFlag && prevCount != thisCount) {
				if (!oneCharFound && thisCount == 1) {
					oneCharFound = true;
				}
				diff = thisCount - prevCount;
				oneTimeFlag = false;
			} else if (!oneCharFound && diff != 1) {
				return NO;
			}

		}

		if (oneCharFound) {
			return YES;
		}

		if (diff == 1 || (diff == -1 && cMap.size() == 2)) {
			return YES;
		} else if (diff > 1 || diff < 0) {
			return NO;
		}

		return YES;
	}
}
