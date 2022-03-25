package leetcode;

public class LongestCommonPrefix {

	public static void main(String args[]) {

		System.out.println(longestCommonPrefix(new String[] { "flower", "flower", "flower", "flower" }));

	}

	public static String longestCommonPrefix(String[] strs) {
		int charIndex = 0;
		int finalIndex = -1;
		boolean flag = true;
		// System.out.println(strs.length);

		if (strs.length == 1) {
			return strs[0];
		}
		int i = 0;
		while (i > -1) {
			if (i + 1 < strs.length && charIndex < strs[i].length() && charIndex < strs[i + 1].length()
					&& strs[i].charAt(charIndex) != strs[i + 1].charAt(charIndex) && flag) {
				flag = false;
			}
			if (!flag) {
				i = -1;
				break;
			}

			if (i + 1 < strs.length && i < strs[i].length() && i < strs[i + 1].length() && flag) {
				finalIndex = i;
			}
			if (i + 1 == strs.length && flag) {
				i = -1;
				++charIndex;
			}

			++i;
		}

		if (finalIndex >= 0) {
			return strs[0].substring(0, finalIndex + 1);
		}
		return "";
	}
}
