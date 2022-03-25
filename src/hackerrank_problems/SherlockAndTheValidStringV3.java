package hackerrank_problems;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidStringV3 {

	static final String YES = "YES";
	static final String NO = "NO";
	static Map<Character, Integer> cMap = new HashMap<Character, Integer>();
	static Map<Integer, Integer> cMapLogic = new HashMap<Integer, Integer>();

	public static void main(String args[]) {
		System.out.println(isValid("aaaaabc"));
	}

	public static String isValid(String s) {

		for (int i = 0; i < s.length(); i++) {

			if (!cMap.containsKey(s.charAt(i))) {
				cMap.put(s.charAt(i), 1);
			} else {
				cMap.put(s.charAt(i), cMap.get(s.charAt(i)) + 1);
			}

		}
		// logic By - Dhruv Soni.
		for (char c : cMap.keySet()) {
			cMapLogic.put(cMap.get(c), 1);
		}

		// till here.
		if (cMapLogic.size() == 1) {
			return YES;
		} else if (cMapLogic.size() > 2) {

			return NO;
		} else if (cMapLogic.size() == 2) {

			if (s.length() % cMap.size() == 1 || s.length() % cMap.size() == cMap.size() - 1) {
				if (cMap.values().contains(1)) {
					char oneChar = '\0';
					int oneCount = 0;
					for (char c : cMap.keySet()) {

						if (cMap.get(c) == 1) {
							oneChar = c;
							++oneCount;
						}
					}
					if (oneCount == 1) {

						cMap.remove(oneChar);
						cMapLogic.clear();
						for (char c : cMap.keySet()) {
							cMapLogic.put(cMap.get(c), 1);
						}
						if (cMapLogic.size() == 1) {
							System.out.println("it did come again here for one removal");
							return YES;
						}

					} else {
						System.out.println("faulty logic here");
						if (oneCount == cMap.size() - 1) {
							System.out.println("faulty condition here");
							return YES;
						}
					}
				} else {
					// if not ones then let's check something else...
					System.out.println("check else");
					if (s.length() % cMap.size() == 1) {
						System.out.println("it's the case");
						return YES;
					}
				}
			}
		}
		return NO;
	}
}
